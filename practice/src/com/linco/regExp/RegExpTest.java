package com.linco.regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Classname: RegExpTest
 * @description: Java正则表达式练习
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-09-20 14:14
 * @Version 1.0
 */
public class RegExpTest {

    private static Pattern EXP_NUM = Pattern.compile(".*?(?=\\()");

    public static void main(String[] args) {
        String str = "成都市(成华区)(武侯区)(高新区)";
        Matcher m = EXP_NUM.matcher(str);
        if (m.find()){
            System.out.println(m.group());
        }

    }

}
