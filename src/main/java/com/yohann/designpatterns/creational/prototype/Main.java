package com.yohann.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Main
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/6 15:03
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Yohann yohann = new Yohann();
        yohann.setName("Yohann Fan");
        yohann.setAge(18);
        yohann.setSex("男");

        List<String> hobbies = new ArrayList<String>() {
            {
                add("吃饭");
                add("睡觉");
            }
        };
        yohann.setHobbies(hobbies);

        // 浅拷贝
        Person shallowCopy = (Person) yohann.clone();

        // 深拷贝
        Person deepCopy = yohann.deepClone();

        // 修改原始对象的引用类型成员变量
        yohann.getHobbies().add("Cooking");

        // 输出结果
        System.out.println("Original Person: " + yohann.getName() + ", Hobbies: " + yohann.getHobbies());
        System.out.println("Shallow Copy: " + shallowCopy.getName() + ", Hobbies: " + shallowCopy.getHobbies());
        System.out.println("Deep Copy: " + deepCopy.getName() + ", Hobbies: " + deepCopy.getHobbies());
    }
}
