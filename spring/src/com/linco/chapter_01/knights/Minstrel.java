package com.linco.chapter_01.knights;

import java.io.PrintStream;

/**
 * @ClassName Minstrel
 * @Description 中世纪游吟诗人 唱颂骑士事迹
 * @Author zbj
 * @Data 2019/4/12 16:25
 * @Version 1.0
 **/
public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream){
        this.stream = stream;
    }
    /**
     * @Author zbj
     * @Description  骑士寻找恶龙前 游吟诗人的唱颂
     * @Date  2019/4/12 16:28
     * @Param []
     * @return void
     **/
    public void singBeforeQuest(){
        stream.println("骑士寻找前，只知道他是一个骑士");
    }
    /**
     * @Author zbj
     * @Description  骑士寻找恶龙后 游吟诗人的唱颂
     * @Date  2019/4/12 16:27
     * @Param []
     * @return void
     **/
    public void singAfterQuest(){
        stream.println("骑士寻找后，我才知道原来他是这么的勇敢和厉害！");
    }
}
