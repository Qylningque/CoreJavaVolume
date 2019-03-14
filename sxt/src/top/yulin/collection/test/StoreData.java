package top.yulin.collection.test;

import java.util.*;

/**
 * ORM思想
 * 存储数据表
 * 编写javabean，通过map或list存储
 */
public class StoreData {

    public static void main(String[] args) {
        Employee employee = new Employee(1001,"linco",66.66);
        Employee employee1 = new Employee(1002,"Tom",77.77);
        Employee employee2 = new Employee(1003,"John",88.88);

        //存入list
        List<Employee> list = new ArrayList<>();
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        //遍历list打印
        for (Employee e:list){
            System.out.println(e);
        }

        //存入Map
        Map<Integer,Employee> map = new HashMap<>();
        map.put(1001,employee);
        map.put(1002,employee1);
        map.put(1003,employee2);
        //遍历map
        Set<Integer> keyset = map.keySet();
        for (Integer key:keyset ) {
            System.out.println(key+","+map.get(key));
        }

    }

}

class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(){}

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
