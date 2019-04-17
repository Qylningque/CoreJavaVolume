package com.linco.chapter_02.stereo_autoconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName CDPlayerConfig
 * @Description 通过Java代码定义Spring装配规则
 * 使用@ComponentScan注解，可以在Spring中启用组件扫描。如果没有其它配置，@ComponentScan默认
 * 会扫描与配置类相同的包，查找带有@Component注解的类
 * 组件扫描默认是不启用的，需要显示配置Spring，
 * 从而命令它去寻找带有@Component注解的类，并为其创建bean。
 * @Author ningque
 * @Data 2019/4/17 22:55
 * @Version 1.0
 **/
@Configuration
@ComponentScan
public class CDPlayerConfig {
}
