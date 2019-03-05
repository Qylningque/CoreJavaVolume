package top.yulin.chapter4.list_4_4;

import top.yulin.chapter4.Employee;

/**
 * 4-4
 * Java中方法参数的使用情况：
 * 1.一个方法不能修改一个基本数据类型的参数（即数值型或布尔型）
 * 2.一个方法可以改变一个对象参数的状态
 * 3.一个方法不能让对象参数引用一个新的对象
 */
public class ParamTest {

    public static void main(String[] args) {

        //1.一个方法不能修改一个基本数据类型的参数（数值型或布尔型）
        System.out.println("1.Testing tripleValue:");
        double perent = 10;
        System.out.println("修改前perent = "+ perent);
        tripleValue(perent);
        System.out.println("修改后perent = " + perent);
        System.out.println("***************************************************");
        //2.一个方法可以改变一个对象参数的状态
        Employee linco = new Employee("linco",999.99,2000,8,01);
        System.out.println("2.Testing tripleSalary:");
        System.out.println("修改前salary = "+ linco.getSalary());
        tripleSalary(linco);
        System.out.println("修改后salary = "+ linco.getSalary());
        System.out.println("***************************************************");
        //3.一个方法不能让对象参数引用一个新的对象
        Employee[] employees = new Employee[2];
        employees[0] = new Employee("a",1,2111,1,1);
        employees[1] = new Employee("b",2,2222,2,2);
        System.out.println("修改前 0 的名字：" + employees[0].getName()+"，"+" 1 的名字为："+ employees[1].getName());
        swap(employees[0],employees[1]);
        System.out.println("修改后 0 的名字：" + employees[0].getName()+"，"+" 1 的名字为："+ employees[1].getName());
    }
    /**
     * 修改一个基本数据类型的参数
     */
    public static void tripleValue(double x){
        x = x * 30 ;
        System.out.println("调用tripleValue方法后x = " + x);
    }
    /**
     * 修改对象参数的状态
     */
    public static void tripleSalary(Employee employee){
        employee.salaryRise(200);
        System.out.println("调用tripleSalary方法后salary = " + employee.getSalary());
    }
    public static void swap(Employee n,Employee m){
        Employee temp = n;
        n = m;
        m = temp;
        System.out.println("方法结束后 n(employees[0]) 的名字：" + n.getName()+"，"+" m(employees[1]) 的名字为："+ m.getName());
    }
}
