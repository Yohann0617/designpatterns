package com.yohann.designpatterns.structural.proxy;

/**
 * <p>
 * FuncInterface
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/7 11:03
 */
public interface FuncInterface {

    /**
     * 问好
     */
    void sayHello();

    /**
     * 支付
     * @return  钱
     */
    Integer pay();
}
