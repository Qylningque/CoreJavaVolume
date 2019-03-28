package top.yulin.collection.hashMap;

/**
 * HashMap手写实现
 * put()|toString|
 *
 */
public class HashMap<K,V> {
    Node[] table;//位桶数组
    int size;//存放键值对的个数

    public HashMap() {
        table = new Node[16];
    }

    //hashPut put()方法
    public void put(K key,V value){

        //待完善，考虑数组扩容

        //定义新的节点对象
        Node newNode = new Node();
        newNode.hash = getHash(key.hashCode(),table.length);
        newNode.key = key;
        newNode.value = value;
        newNode.next = null;
        //定义要存放的节点
        Node temp = table[newNode.hash];
        //定义用于保存最后个节点的临时节点
        Node iterLast = null;
        //定义boolean变量用于判断是否覆盖
        boolean keyRepeat = false;
        if(temp == null){//如果此处数组元素为空，直接把新节点放进去
            table[newNode.hash] = newNode;
            size++;
        }else{//此处数组不为空的情况下
            while (temp!=null){
                if(temp.key.equals(key)){//判断此数组中已存在该key值
                    keyRepeat = true;//覆盖标志改变
                    temp.value = value;//覆盖只改变value
                    break;//不用再继续
                }else{//获得此数组末位的节点
                    iterLast = temp;//临时节点保存最后一个节点
                    temp = temp.next;//直到最后一个节点next为空，跳出循环
                }
            }
            if (!keyRepeat){
                iterLast.next = newNode;//将新节点添加到最后一个节点后
                size++;
            }
        }
    }
    //重写toString()
    @Override
    public String toString(){
        //定义一个用于接收键值对的字符串对象
        StringBuffer sb = new StringBuffer("{");
        //遍历位数组桶
        for (int i = 0 ; i < table.length;i++){
            Node nodes = table[i];
            //循环链表
            while (nodes!=null){
                sb.append(nodes.key + ":" + nodes.value + ",");
                nodes = nodes.next;
            }
        }
        sb.setCharAt(sb.length()-1,'}');
        return sb.toString();
    }
    //get方法
    public V get(K key){
        V value = null;
        int hash = getHash(key.hashCode(),table.length);//获取key对应的hash值
        //遍历位桶数组
        if (table[hash]!=null) {
            Node temp = table[hash];
            //遍历链表获得key对应的value
            while (temp != null) {
                if (temp.key.equals(key)) {
                    value = (V)temp.value;
                    break;
                }else{
                    temp = temp.next;
                }
            }
        }
        return value;
    }
    //计算hash的方法
    public int getHash(int key,int length){
        return (key&(length - 1));//hashmap的长度必须为2的整数幂，位运算计算hash值，形成散点排列
    }

}
