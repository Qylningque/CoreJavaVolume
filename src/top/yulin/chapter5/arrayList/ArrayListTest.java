package top.yulin.chapter5.arrayList;

import java.util.ArrayList;

/**
 * 5-11
 * 将Employee[]替换为ArrryList<Employee></>
 */
public class ArrayListTest {

    public static void main(String[] args) {

        //定义接收对象的数组
        ArrayList<Employee> employees = new ArrayList<>();
        //将对象添加到数组中
        employees.add(new Employee("Linco",222,2002,2,02));
        employees.add(new Employee("Tom",333,2001,1,01));
        employees.add(new Employee("John",444,2003,3,03));
        //循环ArrayList
        for(Employee elements : employees){
            elements.salaryRise(5);
            System.out.println(elements);
        }
    }

}
