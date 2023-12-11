package com.yohann.designpatterns.structural.adapter;

/**
 * <p>
 * Ac220V
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/6 16:53
 */
public class Ac220V {

    public int output220V() {
        System.out.println("输出交流电220V");
        return 220;
    }
}
