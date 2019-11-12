package com.linco.leecode;

/**
 * @Classname: TwoStackToQueue
 * @description: 剑指offer-9-用两个栈实现队列
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-12 22:14
 * @Version 1.0
 */

import java.util.Stack;

/**
 * 题目描述
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class TwoStackToQueue {
    Stack<Integer> in = new Stack<Integer>();
    Stack<Integer> out = new Stack<Integer>();
    //先进入的元素先退出，这就是队列的顺序

    public void push(int node) {
        in.push(node);
    }

    public int pop() {
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
        if(out.isEmpty()&&in.isEmpty()){
            throw new RuntimeException("queue is empty");
        }
        return out.pop();
    }
}
