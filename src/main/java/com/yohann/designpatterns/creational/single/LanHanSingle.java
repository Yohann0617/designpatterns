package com.yohann.designpatterns.creational.single;

/**
 * <p>
 * Single
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/4 17:53
 */
public class LanHanSingle {
    private static volatile LanHanSingle instance;

    private LanHanSingle() {
    }

    public static LanHanSingle getInstance() {
        if (instance == null) {
            synchronized (LanHanSingle.class) {
                if (instance == null) {
                    instance = new LanHanSingle();
                }
            }
        }
        return instance;
    }

    public void say() {
        System.out.println("单例-懒汉式");
    }
}
