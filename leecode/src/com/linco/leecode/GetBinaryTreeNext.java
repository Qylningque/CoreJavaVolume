package com.linco.leecode;

/**
 * @Classname: GetBinaryTreeNext
 * @description: 剑指offer-8-二叉树的下一个节点
 * @Author: Create by qingyulin(寧缺) qylningque@outlook.com
 * @Date: 2019-11-12 21:23
 * @Version 1.0
 */

/**
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class GetBinaryTreeNext {

    public TreeLinkNode getNext(TreeLinkNode pNode){
        if (pNode == null)
            return null;
        //1.当前节点的右子树不为空，则下一节点为该子树右子树的最左节点
        if (pNode.right != null){
            TreeLinkNode rightTree = pNode.right;
            while (rightTree.left != null){
                rightTree =  rightTree.left;
            }
            return rightTree;
        }else{//2.否则，向上找第一个做链接指向的树包含该节点的祖先节点
            while (pNode.next != null){
                TreeLinkNode parentNode = pNode.next;
                if (parentNode.left == pNode)
                    return parentNode;
                pNode = pNode.next;
            }
        }
        return null;
    }


    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
}

