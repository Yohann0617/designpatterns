package com.yohann.designpatterns.creational.builder;

/**
 * <p>
 * 套餐
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/7 17:36
 */
public class Package {

    /**
     * 主食
     */
    private String stapleFood;

    /**
     * 副食
     */
    private String sideFood;

    /**
     * 饮料
     */
    private String drink;

    public String getStapleFood() {
        return stapleFood;
    }

    public void setStapleFood(String stapleFood) {
        this.stapleFood = stapleFood;
    }

    public String getSideFood() {
        return sideFood;
    }

    public void setSideFood(String sideFood) {
        this.sideFood = sideFood;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    /**
     * 套餐展示
     */
    public void show() {
        System.out.println(new StringBuffer().append("当前套餐内容：").append("\n")
                .append("主食：").append(getStapleFood()).append("\n")
                .append("副食：").append(getSideFood()).append("\n")
                .append("饮料：").append(getDrink()).toString());
    }
}
