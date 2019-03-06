package top.yulin.chapter5.abstractClasses;

/**
 * 5-5
 * 抽象类：Person
 */
public abstract class Person {

    //抽象方法
    public abstract String getDescription();
    //私有实例域
    private String name;

    //重载构造方法
    public Person(String aName){
        name = aName;
    }
    //获取name
    public String getName(){
        return name;
    }
}
