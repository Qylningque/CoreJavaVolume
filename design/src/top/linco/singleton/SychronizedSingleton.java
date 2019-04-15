package src.top.linco.singleton;

/**
 * @ClassName SychronizedSingleton
 * @Description 单例模式,通过添加sychronized同步关键字到静态类方法中解决多线程问题
 * @Author ningque
 * @Data 2019/4/15 11:12
 * @Version 1.0
 **/
public class SychronizedSingleton {
    /**
     * @Description  利用一个静态变量来记录Singleton类的唯一实例
     **/
    private static SychronizedSingleton uniqueInstance;
    /**
     * @Description  //把构造器声明为私有的，只有自Singleton类才可以调用构造器
     **/
    private SychronizedSingleton(){}
    /**
     * @Description  //用getInstance()方法实例化对象，并返回这个实例
     * @Param []
     * @return src.top.linco.singleton.Singleton
     **/
    public static synchronized SychronizedSingleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new SychronizedSingleton();
        }
        return uniqueInstance;
    }
}
