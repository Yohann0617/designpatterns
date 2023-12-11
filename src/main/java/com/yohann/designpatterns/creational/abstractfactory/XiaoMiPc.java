package com.yohann.designpatterns.creational.abstractfactory;

/**
 * <p>
 * 小米电脑
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/5 13:55
 */
public interface XiaoMiPc {

    /**
     * 开机
     */
    void open();

    /**
     * 浏览网页
     *
     * @param webAddress 网页地址
     */
    void browseWeb(String webAddress);

    /**
     * 关机
     */
    void close();
}
