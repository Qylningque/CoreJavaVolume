package top.yulin.chapter4;

/**
 * 加入id后的雇员类
 */
public class Employee2 {

    private static int nextId = 1;
    private int id;
    private String name;
    private double salary;

    public Employee2(String n,double s){
        this.name = n;
        this.salary = s;
        this.id = 0;
    }

    public void setId(){
        this.id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
