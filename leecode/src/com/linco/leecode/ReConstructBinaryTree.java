package com.linco.leecode;

/**
 * @Classname: ReConstructBinaryTree
 * @description: 剑指offer-7-重建二叉树
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-11 22:01
 * @Version 1.0
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 题目描述
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class ReConstructBinaryTree {

    //缓存中序遍历数组每个值对应的索引
    private Map<Integer,Integer> indexForInorders = new HashMap<>();
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        if(pre == null || in == null){
            return null;
        }
        //将中序遍历每个值与索引存入缓存Map中
        for(int i = 0; i<in.length; i++){
            indexForInorders.put(in[i],i);
        }
        //根据前序遍历数组及缓存map中根节点的索引位置通过递归来重建二叉树
        return reConstructBinaryTree(pre,0,pre.length-1,0);
    }

    public TreeNode reConstructBinaryTree(int[] pre,int preL,int preR,int inL){
        if(preL > preR){
            return null;
        }
        //获取根节点,前序遍历数组的第一个元素
        TreeNode root = new TreeNode(pre[preL]);
        //获取根节点在中序遍历所在索引
        int inIndex = indexForInorders.get(root.val);
        //左子树长度
        int leftTreeNodeSize = inIndex - inL;
        //左子树
        root.left = reConstructBinaryTree(pre,preL + 1,preL + leftTreeNodeSize,inL);
        //右子树
        root.right = reConstructBinaryTree(pre,preL + leftTreeNodeSize + 1,preR,inL+leftTreeNodeSize+1);
        return root;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}

