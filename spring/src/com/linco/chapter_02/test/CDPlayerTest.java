package com.linco.chapter_02.test;

import com.linco.chapter_02.stereo_autoconfig.CDPlayer;
import com.linco.chapter_02.stereo_autoconfig.CDPlayerConfig;
import com.linco.chapter_02.stereo_autoconfig.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * @ClassName CDPlayerTest
 * @Description JUnit测试，会创建Spring上下文，并判断CompactDisc是不是真的创建出来了
 * @Author ningque
 * @Data 2019/4/17 23:28
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc cd;

    /**
     *如果不为null，意味着Spring能够发现CompactDisc类，自动在Spring上下文中将其创建为
     *bean并将其注入到测试代码中
     */
    @Test
    public void cdShouldNotBeNull(){
        cd.play();
        assertNotNull(cd);
    }

}
