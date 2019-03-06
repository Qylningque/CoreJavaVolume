package top.yulin.chapter5.equals;

/**
 * 5-8
 * 实现Employee类和Manager类的equals\hashCode\toString方法
 */
public class EqualsTest {

    public static void main(String[] args) {

        Employee Tom1 = new Employee("Tom",333,1999,1,1);
        Employee Tom2 = Tom1;
        Employee Tom3 = new Employee("Tom",333,1999,1,1);
        Employee John = new Employee("John",222,1995,2,2);
        System.out.println("Tom1 == Tom2:"+ (Tom1 == Tom2) + ",Tom1 == Tom3:"+ (Tom1 == Tom3));
        System.out.println("Tom1.equals(Tom2):"+Tom1.equals(Tom2) + ",Tom1.equals(Tom3):"+Tom1.equals(Tom3));
        System.out.println("Tom1.equals(John):"+Tom1.equals(John));
        System.out.println("John.toString():"+John);

        Manager carl = new Manager("Carl",88888,1998,1,1);
        Manager boss = new Manager("Carl",88888,1998,1,1);
        boss.setBons(500);
        System.out.println("boss.toString():"+boss);
        System.out.println("carl.equals(boss):"+carl.equals(boss));
        System.out.println("boss.hashCode():"+boss.hashCode());
        System.out.println("carl.hashCode():"+carl.hashCode());
        System.out.println("Tom1.hashCode():"+Tom1.hashCode());
        System.out.println("Tom2.hashCode():"+Tom2.hashCode());
        System.out.println("Tom3.hashCode():"+Tom3.hashCode());
        System.out.println("John.hashCode():"+John.hashCode());
    }

}
