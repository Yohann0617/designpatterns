package com.yohann.test.concurrent;

/**
 * <p>
 * Daemon
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/15 17:51
 */
public class DaemonTest {
    public static void main(String[] args) {

        long begin = System.currentTimeMillis();

        Thread thread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread is running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "fyh");

        // 将线程设置为守护线程
        thread.setDaemon(true);

        // 启动线程
        thread.start();

        // 主线程休眠一段时间，以便观察守护线程的执行
        try {
            System.out.println("Main thread begin sleeping.");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();


        System.out.println("Main thread exiting.");

        System.out.println("总耗时：" + (end - begin) + " ms");
    }
}
