package top.yulin.chapter5.arrayList;

import java.time.LocalDate;

public class Employee {

    private String name;//姓名
    private Double salary;//薪水
    private LocalDate hireDay;//入职日期
    //新增员工
    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
