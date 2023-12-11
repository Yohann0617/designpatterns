package com.yohann.designpatterns.creational.simplefactory;

import java.util.Base64;

/**
 * <p>
 * CipherMachineA
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/4 18:31
 */
public class CipherMachineA implements CipherMachine {
    /**
     * 状态
     */
    private static volatile boolean status = false;

    public CipherMachineA() {
        if (!status) {
            open();
        }
    }

    @Override
    public void open() {
        if (!status) {
            status = true;
            // TODO: 2023/12/4 打开密码机操作...

            System.out.println("密码机A打开成功");
        }
    }

    @Override
    public String encode(String text) {
        checkStatus();
        // 模拟加密
        return Base64.getEncoder().encodeToString(text.getBytes());
    }

    @Override
    public String decode(String encodeText) {
        checkStatus();
        try {
            // 模拟解密大数量
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 模拟解密
        return new String(Base64.getDecoder().decode(encodeText));
    }

    @Override
    public void stop() {
        if (status) {
            status = false;
            // TODO: 2023/12/4 关闭密码机操作...

            System.out.println("密码机A关闭成功");
        }
    }

    /**
     * 检查设备状态
     */
    private void checkStatus() {
        if (!status) {
            throw new RuntimeException("请先打开密码机");
        }
    }
}
