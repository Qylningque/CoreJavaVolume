package top.yulin.chapter4;

import java.time.LocalDate;

/**
 * 员工类测试
 */
public class EmployeeTest {

    public static void main(String[] args) {
        //创建员工对象数组
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("linco",999.99,2018,06,27);
        employees[1] = new Employee("Davie",888.88,2017,05,23);
        employees[2] = new Employee("Vivan",666.66,2016,03,28);
        //涨工资
        for (Employee elements: employees) {
            elements.salaryRise(9.9);
            System.out.println(elements.getName()+","+elements.getHireDay()+"入职，目前薪水:"+elements.getSalary());
        }
    }


}
