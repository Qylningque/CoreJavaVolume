package top.yulin.chapter6.interfaces;

import java.util.Arrays;

/**
 * 6-1
 * 实现Sort方法首先需要实现Comparable接口中的compareTo()方法
 */
public class EmployeeSortTest {

    public static void main(String[] args) {

        Employee[] employee = new Employee[3];
        employee[0] = new Employee("linco",555.55);
        employee[1] = new Employee("Tom",444.44);
        employee[2] = new Employee("John",666.66);
        //对象数组排序
        Arrays.sort(employee);
        //遍历打印
        for (Employee element:employee) {
            System.out.println(element);
        }

    }

}
