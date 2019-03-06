package top.yulin.chapter5.abstractClasses;

/**
 * 5-7
 * 学生类，继承Person抽象类
 */
public class Student extends Person{

    //定义私有实例域
    private String major;

    //重载构造方法
    public Student(String aName,String aMajor){
        super(aName);//引用父类构造方法
        major = aMajor;
    }

    //实现抽象方法
    public String getDescription(){
        return "此学生主修"+major;
    }

    public String getMajor() {
        return major;
    }
}
