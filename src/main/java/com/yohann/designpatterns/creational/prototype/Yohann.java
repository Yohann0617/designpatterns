package com.yohann.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Yohann
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/6 15:00
 */
public class Yohann extends Person {

    public Yohann() {
        super();
    }

    public Yohann(String name, Integer age, String sex, List<String> hobbies) {
        super(name, age, sex, hobbies);
    }

    @Override
    protected Yohann deepClone() {
        List<String> hobbiesCopy = new ArrayList<>(super.getHobbies());
        return new Yohann(super.getName(), super.getAge(), super.getSex(), hobbiesCopy);
    }
}
