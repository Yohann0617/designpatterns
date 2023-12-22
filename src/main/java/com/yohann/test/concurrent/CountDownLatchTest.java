package com.yohann.test.concurrent;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * <p>
 * CountDownLatchTest
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/18 14:43
 */
public class CountDownLatchTest {

    static class Worker implements Runnable {
        private String name;
        private CountDownLatch latch;

        public Worker(String name, CountDownLatch latch) {
            this.name = name;
            this.latch = latch;
        }

        @Override
        public void run() {
            System.out.println(name + " init value -> " + latch.getCount());

            // 模拟工作任务
            System.out.println(name + " is performing the task...");

            try {
                Thread.sleep(new Random().nextInt(4001) + 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 工作完成，计数器减一
            latch.countDown();

            System.out.println(name + " has completed the task. CountDownLatch count: " + latch.getCount());
        }
    }

    public static void main(String[] args) {
        // 设置计数器初始值为3
        CountDownLatch latch = new CountDownLatch(2);

        // 创建并启动三个线程
        new Thread(new Worker("Worker 1", latch)).start();
        new Thread(new Worker("Worker 2", latch)).start();
        new Thread(new Worker("Worker 3", latch)).start();
        new Thread(new Worker("Worker 4", latch)).start();
        new Thread(new Worker("Worker 5", latch)).start();

        try {
            // 主线程等待，直到计数器变为零
            latch.await();

            if (latch.getCount() == 0) {
                System.out.println("count == 0 !!!");
            }

            Thread.sleep(1000);

            System.out.println("-- All workers have completed their tasks. Main thread continues. --");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
