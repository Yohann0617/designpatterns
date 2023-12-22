package com.yohann.test.common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <p>
 * 反射
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/15 18:28
 */
public class ReflectionTest {

    public static void say() {
        System.out.println("hello");
    }

    public static void say(String str) {
        System.out.println("hello " + str);
    }

    public static void say(Integer num) {
        System.out.println("hello " + num);
    }

    public static void main(String[] args) {
        // 推荐ClassLoader    拓展性好一点，可自定义类加载器
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try {
            Class<?> aClass = classLoader.loadClass("com.yohann.test.common.ReflectionTest");
            Object instance = aClass.newInstance();
            Method method = aClass.getMethod("say", String.class);
            method.invoke(instance, "fyh");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println("-----------------");

        // Class.forName
        try {
            Class<?> forName = Class.forName("com.yohann.test.common.ReflectionTest");
            Object forNameInstance = forName.newInstance();
            Method method = forName.getMethod("say", String.class);
            method.invoke(forNameInstance, "Yohann");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
