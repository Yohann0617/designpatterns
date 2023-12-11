package com.yohann.designpatterns.creational.single;

/**
 * <p>
 * Main
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/4 17:59
 */
public class Main {
    public static void main(String[] args) {
        LanHanSingle.getInstance().say();
        EHanSingle.getInstance().say();
    }
}
