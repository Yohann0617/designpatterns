package com.yohann.designpatterns.structural.adapter;

/**
 * <p>
 * Main
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/6 16:49
 */
public class Main {
    public static void main(String[] args) {
        ClassAdapterDc5V classAdapterDc5V = new ClassAdapterDc5V();
        System.out.println("类适配器输出：" + classAdapterDc5V.output5V() + "V");
        System.out.println("----------------------------------------------------------");
        ObjectAdapterDc5V objectAdapterDc5V = new ObjectAdapterDc5V(new Ac220V());
        System.out.println("对象适配器输出：" + objectAdapterDc5V.output5V() + "V");
    }
}
