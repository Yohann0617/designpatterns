package com.yohann.designpatterns.creational.single;

/**
 * <p>
 * EHanSingle
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/4 18:02
 */
public class EHanSingle {
    private static final EHanSingle instance = new EHanSingle();

    private EHanSingle() {
    }

    public static EHanSingle getInstance() {
        return instance;
    }

    public void say(){
        System.out.println("单例-饿汉式");
    }
}
