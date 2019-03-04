package top.yulin.chapter4;

/**
 * 静态方法、域测试
 */
public class StaticTest {

    public static void main(String[] args) {
        Employee2[] employee = new Employee2[3];

        employee[0] = new Employee2("linco",5000);
        employee[1] = new Employee2("Tom",4000);
        employee[2] = new Employee2("John",3000);

        for (Employee2 elements: employee) {
            elements.setId();
            System.out.println(elements.getId()+","+elements.getName()+","+elements.getSalary());
        }
        //打印下一个id
        System.out.println("下一个id:"+Employee2.getNextId());
    }

}
