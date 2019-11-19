package com.linco.leecode;

/**
 * @Classname: Power
 * @description: 16.数值的整数次方-剑指offer
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-19 22:25
 * @Version 1.0
 */

/**
 *题目描述
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * 保证base和exponent不同时为0
 */
public class Power {
    public double Power(double base, int exponent) {
        if(exponent == 0) {
            return 1;
        }
        if(exponent == 1) {
            return base;
        }
        boolean isNegative = false;
        if(exponent < 0){
            exponent = -exponent;
            isNegative = true;
        }
        double pow = Power(base * base , exponent / 2);
        if(exponent % 2 != 0) {
            pow = pow * base;
        }
        return isNegative ? 1 / pow : pow;
    }
}
