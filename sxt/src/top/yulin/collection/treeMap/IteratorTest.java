package top.yulin.collection.treeMap;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 测试遍历
 */
public class IteratorTest {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("s");
        list.add("d");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("j");
        list.add("k");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            iterator.remove();
            System.out.println(o);
        }
        /*for (Iterator iterator = list.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
        for (String element:list ) {
            System.out.println(element);
        }
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }*/

    }
}

