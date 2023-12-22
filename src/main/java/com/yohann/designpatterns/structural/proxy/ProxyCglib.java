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

    static class TargetClass {
        public void publicMethod() {
            System.out.println("Public method");
        }

        private void privateMethod() {
            System.out.println("Private method");
        }

        public final void finalMethod() {
            System.out.println("Final method");
        }
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        // 在方法执行前的逻辑
        System.out.println("Before method: " + method.getName());

        // 调用原始方法
        Object result = proxy.invokeSuper(obj, args);

        // 在方法执行后的逻辑
        System.out.println("After method: " + method.getName());

        return result;
    }

    public static void main(String[] args) {
        // 创建Enhancer对象
        Enhancer enhancer = new Enhancer();
        // 设置目标类
        enhancer.setSuperclass(TargetClass.class);
        // 设置回调对象
        enhancer.setCallback(new ProxyCglib());

        // 创建代理对象
        TargetClass proxy = (TargetClass) enhancer.create();

        // 调用代理对象的方法
        proxy.publicMethod();
        // 无法代理私有方法
        proxy.privateMethod();
        // 无法代理final方法
        proxy.finalMethod();
    }
}
