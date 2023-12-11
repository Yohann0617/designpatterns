package com.yohann.designpatterns.creational.simplefactory;

/**
 * <p>
 * 密码机
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/4 18:17
 */
public interface CipherMachine {

    /**
     * 打开设备
     */
    void open();

    /**
     * 加密
     *
     * @param text 原文
     * @return 密文
     */
    String encode(String text);

    /**
     * 解密
     *
     * @param encodeText 密文
     * @return 原文
     */
    String decode(String encodeText);

    /**
     * 关闭设备
     */
    void stop();
}
