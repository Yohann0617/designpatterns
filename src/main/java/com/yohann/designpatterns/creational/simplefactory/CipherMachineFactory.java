package com.yohann.designpatterns.creational.simplefactory;

/**
 * <p>
 * CipherMachineFactory
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/4 18:25
 */
public class CipherMachineFactory {

    /**
     * 根据类型获取密码机，注：这里是多例，如果需要单例模式（推荐懒汉式+双重检测），自行修改相关代码
     *
     * @param typeEnum 密码机类型
     * @return 密码机
     */
    public static CipherMachine getCipherMachineByType(CipherMachineTypeEnum typeEnum) {
        switch (typeEnum) {
            case CIPHER_MACHINE_TYPE_A:
                return new CipherMachineA();
            case CIPHER_MACHINE_TYPE_B:
                return new CipherMachineB();
            default:
                throw new RuntimeException("unsupported CipherMachine type");
        }
    }
}
