package top.yulin.collection.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 测试集合中的方法，测试索引的方法
 */
public class ArrayTest {
    public static void main(String[] args) {
        //测试集合中的方法
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");

        list.addAll(list2);//将一个list中的元素全部加到另一个数组中
        System.out.println(list);
        list.removeAll(list2);//移除一个list与另一个list中所有相同的元素,移除交集
        System.out.println(list);
        list.retainAll(list2);//移除一个list与另一个list中所有不同的元素，只保留相同的，保留交集
        System.out.println(list);
        boolean a = list.containsAll(list2);//判断一个list是否包含另一个list所有元素，子集合
        System.out.println(a);
        //测试索引的方法
        List<String> list3 = new ArrayList<>();
        list3.add("A");
        list3.add("B");
        list3.add("C");
        list3.add(0,"AA");//在指定角标处添加元素，当前位置其它元素右移一位
        list3.set(0,"AAA");//在指定角标出设置元素值，替换当前元素的值，其它角标位置元素不改变
        list3.remove(0);//移除指定角标元素
        list3.indexOf("A");//返回指定元素角标，从左往右开始找 -->
        list3.lastIndexOf("A");//返回指定元素角标，从右往左开始找  <--
    }
}
