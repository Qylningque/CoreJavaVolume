package src.top.yulin.collection.linkedlist;

/**
 * 定义一个Node类用于linkedList手写
 */
public class Node {

    Node previous;
    Node next;
    Object element;

    public Node(Node previous, Node next, Object element) {
        super();
        this.previous = previous;
        this.next = next;
        this.element = element;
    }

    public Node(Object element) {
        super();
        this.element = element;
    }
}
