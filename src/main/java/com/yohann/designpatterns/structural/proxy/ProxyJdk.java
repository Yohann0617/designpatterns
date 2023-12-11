package com.yohann.designpatterns.structural.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * <p>
 * Jdk动态代理
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/7 16:03
 */
public class ProxyJdk implements InvocationHandler {

    private final Object targetObj;

    public ProxyJdk(Object targetObj) {
        this.targetObj = targetObj;
    }

    /**
     * 为目标对象生成代理对象
     * 注意：如使用该方法，当前类不需要implements InvocationHandler并重写invoke(Object proxy, Method method, Object[] args)方法
     *
     * @return 代理对象
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(targetObj.getClass().getClassLoader(), targetObj.getClass().getInterfaces(),
                // 实现InvocationHandler接口并重写invoke(Object proxy, Method method, Object[] args)方法
                (proxy, method, args) -> {
                    System.out.println("[JDK动态代理1]前...");
                    Object proxyObj = method.invoke(targetObj, args);
                    System.out.println("[JDK动态代理1]代理方法：" + method.getName());
                    System.out.println("[JDK动态代理1]后...");
                    return proxyObj;
                });
    }

    /**
     * <p>
     * 为目标对象生成代理对象
     * <p>
     * 注意：该方法使用时，当前类必须实现InvocationHandler接口并重写invoke(Object proxy, Method method, Object[] args)方法，
     * 此方法和getProxyInstance()获取代理对象是一样的，两者选其一就可以了，这里仅作演示
     *
     * @return 代理对象
     */
    public Object getProxyObj() {
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(targetObj.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类（代理对象）
        return en.create();
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        System.out.println("[JDK动态代理2]前...");
        Object proxyObj = method.invoke(targetObj, args);
        System.out.println("[JDK动态代理2]代理方法：" + method.getName());
        System.out.println("[JDK动态代理2]后...");
        return proxyObj;
    }
}
