package top.yulin.collection.linkedlist;

/**
 * 自定义一个双向链表
 */
public class LinkedList {


    private Node first;
    private Node last;
    private int size;

    //向链表中添加元素
    public void add(Object obj){
        Node node = new Node(obj);
        //首先判断是否是第一个节点
        if(first == null){//如果是第一个节点，则节点的上一个与下一个都等于自身，相当于初始化
            first = node;
            last = node;
        }else{
            //添加元素本身
            node.next= null;//元素下一节点为空
            node.previous = last;//元素上一节点为上一个设置的节点
            //设置元素上一个节点元素的上下节点关联
            last.next = node;//上一节点的下一个元素是添加元素
            last = node;//将上一个节点元素设为当前添加的元素，方便下一次添加元素节点使用
        }
        size++;//元素数量+1
    }


}
