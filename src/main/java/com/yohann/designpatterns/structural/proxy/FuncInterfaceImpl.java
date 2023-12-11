package com.yohann.designpatterns.structural.proxy;

/**
 * <p>
 * FuncInterfaceImpl
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/7 11:30
 */
public class FuncInterfaceImpl implements FuncInterface {
    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }

    @Override
    public Integer pay() {
        return 100;
    }
}
