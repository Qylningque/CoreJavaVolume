package src.top.yulin.collection.hashMap;

/**
 * 测试手写实现的HashMap
 */
public class HashMapTest {

    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap();
        hashMap.put(10,"aa");
        hashMap.put(43,"bb");
        hashMap.put(32,"cc");
        hashMap.put(23,"dd");
        hashMap.put(10,"aaaa");//覆盖

        hashMap.put(53,"A");
        hashMap.put(69,"B");
        hashMap.put(85,"C");

        System.out.println(hashMap);
        System.out.println(hashMap.get(69));
        System.out.println(hashMap.size);
    }

}
