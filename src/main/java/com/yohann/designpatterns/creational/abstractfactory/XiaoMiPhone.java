package com.yohann.designpatterns.creational.abstractfactory;

/**
 * <p>
 * 小米手机
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/5 13:54
 */
public interface XiaoMiPhone {

    /**
     * 开机
     */
    void open();

    /**
     * 打电话
     *
     * @param phoneNumber 电话号码
     */
    void call(String phoneNumber);

    /**
     * 关机
     */
    void close();
}
