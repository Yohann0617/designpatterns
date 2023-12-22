package com.yohann.test.common;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <p>
 * CompareTest
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/15 14:41
 */
public class CompareTest {
    // 实现 Comparable 接口
    static class Person implements Comparable<Person> {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Person otherPerson) {
            // 按照年龄进行比较         逆序：compare(otherPerson.age, this.age)   正序：compare(this.age, otherPerson.age)
            return Integer.compare(this.age, otherPerson.age);
//            return Integer.compare(otherPerson.age, this.age);
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + '}';
        }

        public static void main(String[] args) {
//            Person[] people = {
//                    new Person("Alice", 25),
//                    new Person("Bob", 20),
//                    new Person("Charlie", 30)
//            };
//
//            // 使用 Comparable 接口进行排序
//            Arrays.sort(people);
//
//            // 打印排序后的结果
//            for (Person person : people) {
//                System.out.println(person);
//            }


            Person2[] people2 = {
                    new Person2("Alice", 25),
                    new Person2("Bob", 20),
                    new Person2("Charlie", 30)
            };

            // 使用 Comparator 接口进行排序，按照姓名的字母顺序
            Arrays.sort(people2, Comparator.comparing(person2 -> person2.name));

            // 打印排序后的结果
            for (Person2 person : people2) {
                System.out.println(person);
            }
        }
    }

    // 不实现 Comparable 接口
    static class Person2 {
        private String name;
        private int age;

        public Person2(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person2{name='" + name + "', age=" + age + '}';
        }
    }

}