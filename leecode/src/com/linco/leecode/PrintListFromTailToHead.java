package com.linco.leecode;

/**
 * @Classname: PrintListFromTailToHead
 * @description: 剑指offer-6-从头到尾打印链表
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-11 20:57
 * @Version 1.0
 */

import java.util.ArrayList;
import java.util.Stack;

/**
 * 题目描述
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 *
 * 如：1->2->3
 * 打印：3,2,1
 */
public class PrintListFromTailToHead {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        /*//1.递归法
        ArrayList<Integer> result = new ArrayList<>();
        if(listNode != null){
            result.addAll(printListFromTailToHead(listNode.next));
            result.add(listNode.val);
        }
        return result;*/

        //2.栈先进后出
        Stack<Integer> stack = new Stack<>();
        while(listNode != null){
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> result = new ArrayList<>();
        while(!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
    }

}
