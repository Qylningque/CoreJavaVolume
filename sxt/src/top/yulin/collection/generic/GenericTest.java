package top.yulin.collection.generic;

/**
 * 测试泛型
 */
public class GenericTest {

    public static void main(String[] args) {
        //放入String类型
        MyCollection<String> myCollection = new MyCollection<>();
        myCollection.set("李华",0);
        System.out.println(myCollection.get(0));
        //放入Integer类型
        MyCollection<Integer> myCollection1 = new MyCollection<>();
        myCollection1.set(888,1);
        System.out.println(myCollection1.get(1));
    }
}
class MyCollection<E>{
    Object[] object = new Object[5];
    public void set(E e,int index){
           object[index] = e;
    }
    public E get(int index){
        return (E) object[index];
    }
}
