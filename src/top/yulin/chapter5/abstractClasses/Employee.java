package top.yulin.chapter5.abstractClasses;

import java.time.LocalDate;

/**
 * 5-6
 * 员工类，继承抽象类Person
 */
public class Employee extends Person{

    //定义私有实例域
    private double salary;
    private LocalDate hireDay;

    //重载构造方法
    public Employee(String aName,double aSalary,int year,int month,int day){
        super(aName);//引用父类构造方法
        salary = aSalary;
        hireDay = LocalDate.of(year,month,day);
    }
    //实现父类抽象方法
    public String getDescription(){
        return String.format("这个员工的薪水是$%.2f",salary);
    }

    public void raiseSalary(double raise){
        double raiseSalary = salary * raise / 100;
        salary += raiseSalary;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
}
