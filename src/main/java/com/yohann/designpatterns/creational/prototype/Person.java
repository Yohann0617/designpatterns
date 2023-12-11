package com.yohann.designpatterns.creational.prototype;

import java.util.List;

/**
 * <p>
 * Person
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/6 14:38
 */
public abstract class Person implements Cloneable {

    private String name;
    private Integer age;
    private String sex;
    private List<String> hobbies;

    public Person() {
    }

    public Person(String name, Integer age, String sex, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.hobbies = hobbies;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 浅拷贝  只复制对象本身以及对象包含的基本数据类型的成员变量，而不复制引用类型的成员变量。原始对象和浅拷贝的对象共享相同的引用类型成员变量
        return super.clone();
    }

    /**
     * 深拷贝
     * 复制对象以及对象包含的所有成员变量，包括引用类型的成员变量。深拷贝创建了一个完全独立的对象，对原始对象和拷贝对象的修改互不影响。
     *
     * @return 深拷贝对象
     */
    protected abstract Person deepClone();
}
