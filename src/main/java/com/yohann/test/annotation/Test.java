package com.yohann.test.annotation;

/**
 * <p>
 * Test
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/18 13:32
 */
public class Test {

    @MyAnnotation(value = "Yohann", count = 17)
    public void exec() {
        System.out.println("exec test method...");
    }

    public static void main(String[] args) {
        // 获取方法上的注解信息
        Test obj = new Test();
        try {
            // 获取类的Class对象
            Class<?> clazz = obj.getClass();
            // 获取指定方法
            java.lang.reflect.Method method = clazz.getMethod("exec");
            // 获取方法上的注解
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);

            // 打印注解信息
            System.out.println("Value: " + annotation.value());
            System.out.println("Count: " + annotation.count());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
