package src.top.linco.singleton;

/**
 * @ClassName VolatileSingleton
 * @Description 单例模式,通过双重检查加锁，解决多线程问题
 * @Author zbj
 * @Data 2019/4/15 12:08
 * @Version 1.0
 **/
public class VolatileSingleton {
    /**
     * @Description  volatile关键字确保：当uniqueInstance变量被初始化成Singleton实例时，多个线程正确地处理uniqueInstance变量
     **/
    private volatile static VolatileSingleton uniqueInstance;

    private VolatileSingleton(){}

    /**
     * @Description  //用getInstance()方法实例化对象，并返回这个实例
     * @Param []
     * @return src.top.linco.singleton.Singleton
     **/
    public static VolatileSingleton getInstance(){
        /**
         * 检查实例，如果不存在，就进入同步区块
         **/
        if (uniqueInstance == null){
            /**
             * 注意：只有第一次才彻底执行这里的代码
             **/
            synchronized (VolatileSingleton.class){
                /**
                 * 进入区块后，再次检查实例，如果仍是null，才创建实例
                 **/
                if(uniqueInstance == null){
                    uniqueInstance = new VolatileSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
