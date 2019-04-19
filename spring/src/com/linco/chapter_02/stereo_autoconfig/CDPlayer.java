package com.linco.chapter_02.stereo_autoconfig;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName CDPlayer
 * @Description TODO
 * @Author qylni
 * @Data 2019/4/18 22:17
 * @Version 1.0
 **/
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }

    /**
     * @Description  采用@Autowired注解进行自动装配
     * 在Spring初始化bean之后，它会尽可能去满足bean的依赖，
     * 在此依赖是通过带有@Autowired的注解setCompactDisc()方法进行声明的
     **/
    @Autowired
    public void setCompactDisc(CompactDisc cd){
        this.cd = cd;
    }

}
