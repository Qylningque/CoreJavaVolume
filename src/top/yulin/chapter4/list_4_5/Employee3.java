package top.yulin.chapter4.list_4_5;

import java.util.Random;

/**
 * 4-5
 * 重载构造器
 * 用this(...)调用另一个构造器
 * 无参数构造器
 * 对象初始化块
 * 静态初始化块
 * 实例域初始化
 */
public class Employee3 {

    private static int nextId;
    private int id;
    private String name = "";//实例域初始化
    private double salary;

    //静态初始化块
    static{
        Random generator = new Random();
        //设置nextId为0~9999之间的整数
        nextId = generator.nextInt(10000);
    }
    //对象初始化块
    {
        id = nextId;
        nextId++;
    }
    //重载构造器1
    public Employee3(String aName,double aSalary){
        name = aName;
        salary = aSalary;
    }
    //this(...)调用另一个构造器:Employee3(String aName,double aSalary)
    public Employee3(double aSalary){
        this("Employee #"+nextId,aSalary);
    }
    //无参构造器（默认）
    public Employee3(){
        //id 在对象初始化块中已赋值
        //name = ""
        //salary = 0
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
