package com.yohann.designpatterns.creational.builder;

/**
 * <p>
 * 具体构造者-套餐B
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/7 18:08
 */
public class PackageBuilderB extends Builder {
    @Override
    protected void buildStapleFood() {
        pkg.setStapleFood("米饭");
    }

    @Override
    protected void buildSideFood() {
        pkg.setSideFood("饼干");
    }

    @Override
    protected void buildDrink() {
        pkg.setDrink("可乐");
    }
}
