package top.yulin.chapter5.equals;

import java.time.LocalDate;
import java.util.Objects;

/**
 * 5-9
 *  Employee类的equals\hashCode\toString方法
 */
public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;
    //构造函数
    public Employee(String aName,double aSalary,int year,int month,int day){
        name = aName;
        salary = aSalary;
        hireDay = LocalDate.of(year,month,day);
    }
    //涨工资
    public void raiseSalary(double byPercent){
        double rasise = salary * byPercent / 100;
        salary += rasise;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
    //equals方法
    public boolean equals(Object aObject){
        //判断对象是否相等
        if(this == aObject) return true;
        //判断对象是否为空
        if (aObject == null) return false;
        //如果两个对象的类不相等，则不可能相等
        if (getClass() != aObject.getClass()) return false;
        //到此aObject是一个非空对象，将该对象转换为Employee对象
        Employee aEmployee = (Employee) aObject;
        //判断两个对象中的每个实例域是否相等
        return Objects.equals(name,aEmployee.name) && salary == aEmployee.salary && Objects.equals(hireDay,aEmployee.hireDay);

    }

    //hashCode方法
    public int hashCode(){
        return Objects.hash(name,salary,hireDay);
    }
    //toString方法
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
