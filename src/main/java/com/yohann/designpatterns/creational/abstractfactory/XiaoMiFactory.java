package com.yohann.designpatterns.creational.abstractfactory;

/**
 * <p>
 * 小米产品工厂
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/5 13:53
 */
public interface XiaoMiFactory {

    /**
     * 创建小米手机
     *
     * @return 小米手机
     */
    XiaoMiPhone createXiaoMiPhone();

    /**
     * 创建小米电脑
     *
     * @return 小米电脑
     */
    XiaoMiPc createXiaoMiPc();
}
