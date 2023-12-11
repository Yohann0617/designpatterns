package com.yohann.designpatterns.structural.adapter;

/**
 * <p>
 * ObjectAdapterDc5V
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/6 16:46
 */
public class ObjectAdapterDc5V implements Target {
    private final Ac220V ac220V;

    public ObjectAdapterDc5V(Ac220V ac220V) {
        this.ac220V = ac220V;
    }

    @Override
    public int output5V() {
        int output220V = ac220V.output220V();
        // 模拟变压器
        int output = output220V / 44;
        System.out.println("使用PowerAdapter输入AC：" + output220V + "V" + "，输出DC：" + output + "V");
        return output;
    }
}
