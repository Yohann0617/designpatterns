package com.yohann.designpatterns.creational.simplefactory;

import java.util.stream.IntStream;

/**
 * <p>
 * main
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/4 18:38
 */
public class Main {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        CipherMachine cipherMachine = CipherMachineFactory.getCipherMachineByType(CipherMachineTypeEnum.CIPHER_MACHINE_TYPE_A);
//        CipherMachine cipherMachine = CipherMachineFactory.getCipherMachineByType(CipherMachineTypeEnum.CIPHER_MACHINE_TYPE_B);
        String str = "Yohann";
        IntStream.rangeClosed(1, 10)
                .parallel() // 耗时操作的话，并行更快
                .forEach(x -> {
                    System.out.println("-------------第" + x + "次开始-------------");
                    // 测试是否会重复打开
                    cipherMachine.open();

                    String encode = cipherMachine.encode(str);
                    String decode = cipherMachine.decode(encode);
//                    System.out.println("原文：" + str);
//                    System.out.println("密文：" + encode);
//                    System.out.println("解密后的原文：" + decode);
                    System.out.println("第" + x + "次加解密结果：" + decode.equals(str));
                    System.out.println("-------------第" + x + "次结束-------------");
                });
        cipherMachine.stop();
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - begin) + "ms");
    }
}
