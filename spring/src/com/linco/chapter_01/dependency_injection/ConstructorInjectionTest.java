package com.linco.chapter_01.dependency_injection;

/**
 * DI依赖注入实现
 * 1.构造器注入 construction injection
 */
public class ConstructorInjectionTest {

    private CJTest cjTest;

    /**
     * 传统做法，每个对象负责管理与自己相互协作的对象（即它所依赖的对象）
     * 的引用，这将会导致高度耦合和难以测试的代码
     */
    public ConstructorInjectionTest(){
        this.cjTest = new CJTest();
    }

    /**
     * @Author zbj
     * @Description  构造器注入--> 松耦合
     * @Date  2019/4/12 15:59
     * @Param [aCJTest]
     * @return
     **/
    public ConstructorInjectionTest(CJTest aCJTest){
        this.cjTest = aCJTest;
    }
}
