package com.yohann.designpatterns.creational.builder;

/**
 * <p>
 * 指挥者
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/7 18:12
 */
public class Director {

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Package getCompletePkg() {
        builder.createPkg();
        builder.buildStapleFood();
        builder.buildSideFood();
        builder.buildDrink();
        return builder.getPkg();
    }
}
