package com.linco.data;


import java.io.UnsupportedEncodingException;

/**
 * @Classname: Translate
 * @description: 数据类型->输出一个某种编码的字符串
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-09-20 17:00
 * @Version 1.0
 */
public class Translate {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "ABC";
        str = new String(str.getBytes("ISO-8859-1"),"GBK");
        str = str.trim();
        System.out.println(str);
    }

}
