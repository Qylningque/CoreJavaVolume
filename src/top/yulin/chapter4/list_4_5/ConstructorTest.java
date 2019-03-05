package top.yulin.chapter4.list_4_5;
/**
 * 4-5
 * 重载构造器
 * 用this(...)调用另一个构造器
 * 无参数构造器
 * 对象初始化块
 * 静态初始化块
 * 实例域初始化
 */
public class ConstructorTest {

    public static void main(String[] args) {
        Employee3[] employee3s = new Employee3[3];
        employee3s[0] = new Employee3("linco",999.99);//调用重载构造器
        employee3s[1] = new Employee3(888.88);//调用this()调用Employee3(String aName,double aSalary)构造器的构造器
        employee3s[2] = new Employee3();//调用默认构造器

        for (int i = 0;i<employee3s.length;i++){
            System.out.println(employee3s[i]);
        }
    }

}
