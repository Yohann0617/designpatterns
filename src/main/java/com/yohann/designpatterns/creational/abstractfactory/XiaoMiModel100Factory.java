package com.yohann.designpatterns.creational.abstractfactory;

/**
 * <p>
 * 小米产品（型号100）工厂类
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/5 14:19
 */
public class XiaoMiModel100Factory implements XiaoMiFactory {
    @Override
    public XiaoMiPhone createXiaoMiPhone() {
        return new XiaoMiPhoneP100();
    }

    @Override
    public XiaoMiPc createXiaoMiPc() {
        return new XiaoMiPcT100();
    }
}
