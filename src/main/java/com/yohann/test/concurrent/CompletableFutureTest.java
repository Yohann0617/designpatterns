package com.yohann.test.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

/**
 * <p>
 * Test
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/14 10:50
 */
public class CompletableFutureTest {
    public static void main(String[] args) {
        List<CompletableFuture<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            CompletableFuture<Integer> supplyAsync = CompletableFuture.supplyAsync(() -> {
                Integer nextInt = null;
                try {
                    nextInt = new Random().nextInt(4001) + 1000;
                    Thread.sleep(nextInt);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("当前线程：" + Thread.currentThread().getName());
                if (nextInt > 4000) {
                    throw new RuntimeException("> 4000");
                }
                return nextInt;
            })
                    .exceptionally(e -> {
                        // 相当于try/catch中的catch 下面whenCompleteAsync中的异常会变为null
                        System.out.println("exceptionally XXXXXX报错了XXXXXXX");
                        return null;
                    })
                    .whenCompleteAsync((x, y) -> {
                        if (y != null) {
                            System.out.println("whenCompleteAsync XXXXXX报错了XXXXXXX");
                        }

                        System.out.println("----->" + x);
                    })
                    ;
            list.add(supplyAsync);
        }

        long begin = System.currentTimeMillis();

        list.forEach(x -> {
            // .join()不会抛出checked异常，.get()会抛出异常，需要显式地处理异常

            //            try {
            //                System.out.println(x.get());
            //            } catch (InterruptedException | ExecutionException e) {
            //                e.printStackTrace();
            //            }

            x.join();

//            Integer join = x.join();
//            System.out.println(join);
        });
        long end = System.currentTimeMillis();

        System.out.println("总耗时：" + (end - begin) + " ms");
    }
}
