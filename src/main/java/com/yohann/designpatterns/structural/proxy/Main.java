package com.yohann.designpatterns.structural.proxy;

/**
 * <p>
 * Main
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/7 13:42
 */
public class Main {
    public static void main(String[] args) {
        FuncInterface funcInterfaceImpl = new FuncInterfaceImpl();

        FuncInterface staticProxy = new ProxyStatic(funcInterfaceImpl);
        staticProxy.sayHello();
        System.out.println("------------------------------------------------");
        Integer staticPay = staticProxy.pay();
        System.out.println("staticProxy pay:" + staticPay);

        System.out.println("================================================");

        ProxyJdk proxyJdk = new ProxyJdk(funcInterfaceImpl);
        FuncInterface proxyInstance = (FuncInterface) proxyJdk.getProxyInstance();
        proxyInstance.sayHello();
        System.out.println("------------------------------------------------");
        Integer jdkPay = proxyInstance.pay();
        System.out.println("jdkProxy pay:" + jdkPay);

        System.out.println("================================================");

        FuncInterface proxyJdkObj = (FuncInterface) proxyJdk.getProxyObj();
        proxyJdkObj.sayHello();
        System.out.println("------------------------------------------------");
        Integer jdkObjPay = proxyJdkObj.pay();
        System.out.println("proxyJdkObj pay:" + jdkObjPay);
    }
}
