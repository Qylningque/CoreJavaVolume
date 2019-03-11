package top.yulin.chapter6.clone;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 6-5
 * Employee类实现接口Cloneable中clone()
 */
public class Employee implements Cloneable{

    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String aName,double aSalary){
        name = aName;
        salary = aSalary;
        hireDay = new Date();
    }

    //实现clone()
    public Employee clone() throws CloneNotSupportedException{
        //克隆对象
        Employee cloned = (Employee)super.clone();
        //克隆可变实例域
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }
    //hireDay的set方法
    public void setHireDay(int year,int month,int day){
        Date newHireDay = new GregorianCalendar(year,month-1,day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }
    //涨工资
    public void salaryRise(double percent){
        double rise = salary * percent / 100;
        salary += rise;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
