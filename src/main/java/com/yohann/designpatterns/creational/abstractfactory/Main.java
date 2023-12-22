package com.yohann.designpatterns.creational.abstractfactory;

/**
 * <p>
 * 抽象工厂模式提供一个接口，用于创建一系列相关或相互依赖的对象，而无需指定具体的类。
 * 它适用于需要一次性创建多个相关对象，以形成一个产品族。
 * 抽象工厂模式通常由抽象工厂、具体工厂、抽象产品和具体产品组成。通过切换具体工厂实现类，可以改变整个产品族。
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/5 14:22
 */
public class Main {
    public static void main(String[] args) {
        XiaoMiFactory xiaoMiModel100Factory = new XiaoMiModel100Factory();
        XiaoMiPhone xiaoMiPhoneModel100 = xiaoMiModel100Factory.createXiaoMiPhone();
        xiaoMiPhoneModel100.call("110");
        xiaoMiPhoneModel100.close();
        System.out.println("--------------------------------------------------------------");
        XiaoMiPc xiaoMiPcModel100 = xiaoMiModel100Factory.createXiaoMiPc();
        xiaoMiPcModel100.browseWeb("www.baidu.com");
        xiaoMiPcModel100.close();
        System.out.println("==============================================================");
        XiaoMiFactory xiaoMiModel200Factory = new XiaoMiModel200Factory();
        XiaoMiPhone xiaoMiPhoneModel200 = xiaoMiModel200Factory.createXiaoMiPhone();
        xiaoMiPhoneModel200.call("119");
        xiaoMiPhoneModel200.close();
        System.out.println("--------------------------------------------------------------");
        XiaoMiPc xiaoMiPcModel200 = xiaoMiModel200Factory.createXiaoMiPc();
        xiaoMiPcModel200.browseWeb("www.yohann.buzz");
        xiaoMiPcModel200.close();
    }
}
