package com.yohann.designpatterns.creational.abstractfactory;

/**
 * <p>
 * Main
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
