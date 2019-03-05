package top.yulin.chapter5;

import java.time.LocalDate;

/**
 * 5-2
 * 普通员工类
 */
public class Employee {

    private String name;//姓名
    private Double salary;//薪水
    private LocalDate hireDay;//入职日期
    //新增员工
    public Employee(String aName, double aSalary, int year, int month, int day){
        name = aName;
        salary = aSalary;
        hireDay = LocalDate.of(year,month,day);
    }
    //根据涨幅涨工资
    public void salaryRise(double byPerent){
        double raise = salary * byPerent/100;
        salary += raise;
    }
    //获取员工信息的方法
    public String getName(){
        return name;
    }
    public Double getSalary(){
        return salary;
    }
    public LocalDate getHireDay(){
        return hireDay;
    }
}
