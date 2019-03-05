package top.yulin.chapter5;

/**
 * 5-3
 * 经理类，继承员工类
 */
public class Manager extends Employee{

    private double bons;

    //重写父类（员工类）构造函数
    public Manager(String aName,double aSalary,int year,int month,int day){
        super(aName,aSalary,year,month,day);//调用父类（员工类）构造函数
        bons = 0;
    }
    //重写getSalary方法
    public Double getSalary(){
        double baseSalary = super.getSalary();//调用父类（员工类）中获得薪水的方法
        return baseSalary + bons;
    }
    //新增设置奖金的方法
    public void setBons(double aBons){
        bons = aBons;
    }

}
