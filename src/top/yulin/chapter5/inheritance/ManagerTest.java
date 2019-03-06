package top.yulin.chapter5.inheritance;

/**
 * 5-1
 * 测试Manager继承Employee
 */
public class ManagerTest {

    public static void main(String[] args) {

        Manager boss = new Manager("王经理",99999,2000,1,01);
        boss.setBons(8888);

        Employee[] employee = new Employee[3];
        employee[0] = boss;
        employee[1] = new Employee("linco",7777,2001,1,06);
        employee[2] = new Employee("Tom",6666,2003,3,15);

        for (Employee element:employee) {
            System.out.println(element.getName()+"于"+element.getHireDay()+"加入公司，每个月￥"+element.getSalary());
        }
    }

}
