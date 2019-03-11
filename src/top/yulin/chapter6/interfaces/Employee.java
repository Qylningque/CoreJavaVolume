package top.yulin.chapter6.interfaces;

/**
 * 6-2
 * 实现接口Comparable的compareTo()方法
 */
public class Employee implements Comparable<Employee>{

    private String name;

    private double salary;

    //重载构造函数
    public Employee(String aName,double aSalary){
        name = aName;
        salary = aSalary;
    }
    //涨工资
    public void salaryRise(double percent){
        double riseSalary = salary * percent / 100 ;
        salary += riseSalary;
    }
    //实现Comparable接口方法
    public int compareTo(Employee otherEmployee){
        return Double.compare(salary,otherEmployee.salary);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
