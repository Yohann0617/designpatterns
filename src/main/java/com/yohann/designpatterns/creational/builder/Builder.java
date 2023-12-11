package com.yohann.designpatterns.creational.builder;

/**
 * <p>
 * 构造者
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/7 17:52
 */
public abstract class Builder {
    protected Package pkg;

    protected void createPkg() {
        pkg = new Package();
    }

    protected abstract void buildStapleFood();

    protected abstract void buildSideFood();

    protected abstract void buildDrink();

    protected Package getPkg() {
        return pkg;
    }
}
