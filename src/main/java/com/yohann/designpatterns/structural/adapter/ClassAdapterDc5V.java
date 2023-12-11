package com.yohann.designpatterns.structural.adapter;

/**
 * <p>
 * ClassAdapterTo5V
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/6 16:39
 */
public class ClassAdapterDc5V extends Ac220V implements Target {

    @Override
    public int output5V() {
        int output220V = super.output220V();
        // 模拟变压器
        int output = output220V / 44;
        System.out.println("使用PowerAdapter输入AC：" + output220V + "V" + "，输出DC：" + output + "V");
        return output;
    }
}
