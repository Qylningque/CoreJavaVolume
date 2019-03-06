package top.yulin.chapter5.abstractClasses;

/**
 * 5-4
 * Person抽象类测试
 */
public class PersonTest {

    public static void main(String[] args) {

        Person[] person = new Person[2];
        person[0] = new Student("linco","computer");
        person[1] = new Employee("Tom",99.99,2000,1,05);

        for (Person elements:person) {
            System.out.println(elements.getName()+","+elements.getDescription());
        }

    }

}
