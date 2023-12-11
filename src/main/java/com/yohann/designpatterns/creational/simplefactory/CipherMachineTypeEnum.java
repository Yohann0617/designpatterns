package com.yohann.designpatterns.creational.simplefactory;

import lombok.Getter;

/**
 * <p>
 * CipherMachineTypeEnum
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/4 18:28
 */
@Getter
public enum CipherMachineTypeEnum {
    CIPHER_MACHINE_TYPE_A("A", "加密机A"),
    CIPHER_MACHINE_TYPE_B("B", "加密机B"),

    ;
    private String code;
    private String desc;

    CipherMachineTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
