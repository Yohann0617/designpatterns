package com.yohann.designpatterns.structural.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <p>
 * Cglib动态代理
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/7 14:11
 */
public class ProxyCglib implements MethodInterceptor {

    /**
     * 要代理的目标对象
     */
    private final Object targetObj;

    public ProxyCglib(Object targetObj) {
        this.targetObj = targetObj;
    }

    /**
     * 获取代理对象
     *
     * @return 代理对象
     */
    public Object getProxyInstance() {
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
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("[Cglib代理]前...");
        Object proxyObj = method.invoke(targetObj, args);
        System.out.println("[Cglib代理]代理方法：" + method.getName());
        System.out.println("[Cglib代理]后...");
        return proxyObj;
    }
}
