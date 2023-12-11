package com.yohann.designpatterns.creational.abstractfactory;

/**
 * <p>
 * 小米电脑（型号T200）
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/5 14:09
 */
public class XiaoMiPcT200 implements XiaoMiPc {
    /**
     * 状态
     */
    private static volatile boolean status = false;

    public XiaoMiPcT200() {
        if (!status) {
            open();
        }
    }

    @Override
    public void open() {
        if (!status) {
            // TODO: 2023/12/5 开机操作...

            status = true;
            System.out.println("小米电脑（T200）开机成功");
        }
    }

    @Override
    public void browseWeb(String webAddress) {
        checkStatus();
        System.out.println("小米电脑（T200）浏览网页：" + webAddress + " 成功！");
    }

    @Override
    public void close() {
        if (status) {
            // TODO: 2023/12/5 关机操作...

            status = false;
            System.out.println("小米电脑（T200）关机成功");
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
