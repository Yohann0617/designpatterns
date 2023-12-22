package com.yohann.test.common;

import java.io.*;

/**
 * <p>
 * 序列化和反序列化
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/15 18:16
 */
public class SerializationTest {
    /**
     * 要被序列化和反序列化的对象类
     */
    static class Person implements Serializable {
        private static final long serialVersionUID = 1L;

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        // 创建一个对象用于序列化
        Person person = new Person("Yohann", 18);

        // 序列化对象
        serializeObject("C:\\Users\\Administrator\\Desktop\\person.ser", person);

        // 反序列化对象
        Person deserializedPerson = deserializeObject("C:\\Users\\Administrator\\Desktop\\person.ser");

        // 打印反序列化后的对象信息
        System.out.println("Deserialized Person: " + deserializedPerson);
    }

    // 序列化对象
    private static void serializeObject(String fileName, Object object) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(object);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 反序列化对象
    private static Person deserializeObject(String fileName) {
        Person person = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            person = (Person) ois.readObject();
            System.out.println("Object deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return person;
    }
}
