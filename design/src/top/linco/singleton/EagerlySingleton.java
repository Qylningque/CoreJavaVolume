package src.top.linco.singleton;

/**
 * @ClassName EagerlySingleton
 * @Description 单例模式,通过急切（eagerly）创建单例解决多线程问题
 * @Author zbj
 * @Data 2019/4/15 12:02
 * @Version 1.0
 **/
public class EagerlySingleton {
    /**
     * @Description  //在静态初始化器中创建单间，保证了线程安全。
     * @Param
     * @return
     **/
    private static EagerlySingleton uniqueInstance = new EagerlySingleton();

    private EagerlySingleton(){}

    public static EagerlySingleton getInstance(){
        return uniqueInstance;
    }

}
