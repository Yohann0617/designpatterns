package com.yohann.designpatterns.structural.proxy;

/**
 * <p>
 * 静态代理
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/7 11:30
 */
public class ProxyStatic implements FuncInterface {

    /**
     * 实际开发中可以注册到spring容器中
     */
    private final FuncInterface funcInterfaceImpl;

    public ProxyStatic(FuncInterface funcInterfaceImpl) {
        this.funcInterfaceImpl = funcInterfaceImpl;
    }

    @Override
    public void sayHello() {
        System.out.println("[静态代理]前...");
        funcInterfaceImpl.sayHello();
        System.out.println("[静态代理]后...");
    }

    @Override
    public Integer pay() {
        Integer pay = funcInterfaceImpl.pay();
        System.out.println("[静态代理]前：" + pay + " 元");
        Integer proxyPay = pay + 200;
        System.out.println("[静态代理]后：" + proxyPay + " 元");
        return proxyPay;
    }
}
