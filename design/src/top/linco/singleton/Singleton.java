package src.top.linco.singleton;

/**
 * @ClassName Singleton
 * @Description 单例模式
 * @Author ningque
 * @Data 2019/4/15 11:12
 * @Version 1.0
 **/
public class Singleton {
    /**
     * @Description  利用一个静态变量来记录Singleton类的唯一实例
     **/
    private static Singleton uniqueInstance;
    /**
     * @Description  //把构造器声明为私有的，只有自Singleton类才可以调用构造器
     **/
    private Singleton(){}
    /**
     * @Description  //用getInstance()方法实例化对象，并返回这个实例
     * @Param []
     * @return src.top.linco.singleton.Singleton
     **/
    public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
