package top.yulin.chapter5.equals;

/**
 * 5-10
 * Manager类的equals\hashCode\toString
 */
public class Manager extends Employee{

    private double bons;//经理类的奖金实例域

    //重载构造函数
    public Manager(String aName,double aSalary,int year,int month,int day){
        super(aName,aSalary,year,month,day);
        bons = 0;
    }
    //获得奖金
    public void setBons(double aBons){
        bons =aBons;
    }
    //重载equals方法
    public boolean equals(Object aObject){
        //判断是否满足父类的equals方法
        if (!super.equals(aObject)) return false;
        //上一步前提下将aObject转换为Manager对象
        Manager aManager = (Manager) aObject;
        return bons == aManager.bons;
    }
    //重载hashCode方法
    public int hashCode(){
        return super.hashCode() + 17 * new Double(bons).hashCode();
    }
    //重载toString方法
    @Override
    public String toString() {
        return super.toString()+"Manager{" +
                "bons=" + bons +
                '}';
    }

    public double getBons() {
        return bons;
    }
}
