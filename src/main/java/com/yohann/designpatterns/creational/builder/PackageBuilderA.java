package com.yohann.designpatterns.creational.builder;

/**
 * <p>
 * 具体构造者-套餐A
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/7 18:08
 */
public class PackageBuilderA extends Builder {
    @Override
    protected void buildStapleFood() {
        pkg.setStapleFood("面包");
    }

    @Override
    protected void buildSideFood() {
        pkg.setSideFood("花生");
    }

    @Override
    protected void buildDrink() {
        pkg.setDrink("牛奶");
    }
}
