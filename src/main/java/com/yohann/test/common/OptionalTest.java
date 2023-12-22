package com.yohann.test.common;

import java.util.Optional;

/**
 * <p>
 * orElse() 无论 Optional 中的值是否为 null，都会计算默认值，而 orElseGet() 只有在 Optional 中的值为 null 时才会计算默认值。
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/18 14:33
 */
public class OptionalTest {

    public static Integer getNumber() {
        System.out.println("getNumber()方法执行了...");
        return 17;
    }

    public static void main(String[] args) {
        System.out.println(Optional.ofNullable(null).orElse(getNumber()).toString());
        System.out.println("----------------------------------------");
        System.out.println(Optional.ofNullable(8).orElse(getNumber()).toString());
        System.out.println("----------------------------------------");
        System.out.println(Optional.ofNullable(null).orElseGet(OptionalTest::getNumber).toString());
        System.out.println("----------------------------------------");
        System.out.println(Optional.ofNullable(9).orElseGet(OptionalTest::getNumber).toString());
    }
}
