package com.linco.leecode;

/**
 * @Classname: ReplaceSpace
 * @description: 剑指offer-替换空格
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-09 23:25
 * @Version 1.0
 */

/**
 * 题目描述
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        //1.获取初始字符串长度p1
        int p1 = str.length() - 1;
        //2.遍历初始化数组，遍历到空格时，往数组最后添加两个空字符
        for(int i = 0 ; i <= p1; i++){
            if(str.charAt(i)==' '){
                str.append("  ");
            }
        }
        //3.获取添加空字符后字符串的长度
        int p2 = str.length() - 1;
        //4.p1和p2从从后向前遍历字符串，如果p1所指位置不为空格，则p2位置设为p1处字符
        //如果p1所指为空格，则p2从当前位置依次向前添加 02%
        while(p1>=0 && p2 > p1){
            char c = str.charAt(p1--);
            if(c == ' '){
                str.setCharAt(p2--,'0');
                str.setCharAt(p2--,'2');
                str.setCharAt(p2--,'%');
            }else{
                str.setCharAt(p2--,c);
            }
        }
        return str.toString();
    }
}
