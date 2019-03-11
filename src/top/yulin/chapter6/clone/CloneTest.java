package top.yulin.chapter6.clone;

/**
 * 6-4
 * 测试深拷贝的克隆
 */
public class CloneTest {

    public static void main(String[] args) {

        try {
            Employee employee = new Employee("linco",99.99);
            employee.setHireDay(1990,2,14);
            Employee cloneEmployee = employee.clone();
            cloneEmployee.salaryRise(5);
            cloneEmployee.setHireDay(2002,1,12);
            System.out.println(employee);
            System.out.println(cloneEmployee);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }

}
