package com.yohann.designpatterns.creational.abstractfactory;

/**
 * <p>
 * 小米电脑（型号T100）
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/5 14:09
 */
public class XiaoMiPcT100 implements XiaoMiPc {
    /**
     * 状态
     */
    private static volatile boolean status = false;

    public XiaoMiPcT100() {
        if (!status) {
            open();
        }
    }

    @Override
    public void open() {
        if (!status) {
            // TODO: 2023/12/5 开机操作...

            status = true;
            System.out.println("小米电脑（T100）开机成功");
        }
    }

    @Override
    public void browseWeb(String webAddress) {
        checkStatus();
        System.out.println("小米电脑（T100）浏览网页：" + webAddress + " 成功！");
    }

    @Override
    public void close() {
        if (status) {
            // TODO: 2023/12/5 关机操作...

            status = false;
            System.out.println("小米电脑（T100）关机成功");
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
