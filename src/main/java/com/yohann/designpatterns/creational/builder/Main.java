package com.yohann.designpatterns.creational.builder;

/**
 * <p>
 * Main
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/7 18:19
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        PackageBuilderA packageBuilderA = new PackageBuilderA();
        PackageBuilderB packageBuilderB = new PackageBuilderB();
        director.setBuilder(packageBuilderA);
        director.getCompletePkg().show();

        System.out.println("-------------------------------------");

        director.setBuilder(packageBuilderB);
        director.getCompletePkg().show();
    }
}
