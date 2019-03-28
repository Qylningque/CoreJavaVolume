package top.yulin.chapter9.iterator;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 测试迭代器
 */
public class IteratorTest {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0 ; i < 100; i++){
            linkedList.add(i);
        }
        Iterator<Integer> iterator = linkedList.iterator();
        /*iterator.forEachRemaining(element -> System.out.println(element));
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        for(Integer element:linkedList){
            System.out.println(element);
        }
    }
}
