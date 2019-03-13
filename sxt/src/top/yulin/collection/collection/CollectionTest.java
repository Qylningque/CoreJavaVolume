package top.yulin.collection.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 容器中方法测试
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.size();//容器中元素数量
        c.isEmpty();//判断容器是否为空
        c.add("李华");//添加元素
        c.add("李小华");//添加元素
        c.remove("李华");//从容器中移除，但元素对象本身仍存在
        c.clear();//清空容器
        Object[] objects = c.toArray();//容器转换类型
        c.contains("李华");//判断容器中是否包含元素 boolean
    }
}
