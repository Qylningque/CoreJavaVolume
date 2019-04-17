package com.linco.chapter_02.stereo_autoconfig;

import org.springframework.stereotype.Component;

/**
 * @ClassName SgtPeppers
 * @Description 接口CompactDisc的实现类:带有@Component注解
 * @Component 注解表明该类会作为组建类，并告知Spring要为这个类创建bean，
 * 而不需要显示配置SgtPeppersbean。
 * 组件扫描默认是不启用的，需要显示配置Spring，从而命令它去寻找带有@Component注解的类，
 * 并为其创建bean。如CDPlayerConfig中所示。
 * @Author ningque
 * @Data 2019/4/17 22:41
 * @Version 1.0
 **/
@Component
public class SgtPeppers implements CompactDisc{

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println(title + ":" + artist);
    }
}
