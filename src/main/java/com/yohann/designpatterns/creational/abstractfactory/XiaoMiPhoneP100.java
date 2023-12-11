package com.yohann.designpatterns.creational.abstractfactory;

/**
 * <p>
 * 小米手机（型号P100）
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/5 14:02
 */
public class XiaoMiPhoneP100 implements XiaoMiPhone {
    /**
     * 状态
     */
    private static volatile boolean status = false;

    public XiaoMiPhoneP100() {
        if (!status) {
            open();
        }
    }

    @Override
    public void open() {
        if (!status) {
            // TODO: 2023/12/5 开机操作...

            status = true;
            System.out.println("小米手机（P100）开机成功");
        }
    }

    @Override
    public void call(String phoneNumber) {
        checkStatus();
        System.out.println("小米手机（P100）打电话给：" + phoneNumber + " 成功！");
    }

    @Override
    public void close() {
        if (status) {
            // TODO: 2023/12/5 关机操作...

            status = false;
            System.out.println("小米手机（P100）关机成功");
        }
    }

    /**
     * 检查设备状态
     */
    private void checkStatus() {
        if (!status) {
            throw new RuntimeException("请先开机");
        }
    }
}
