package com.iqb.jxw.fes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hdli on 2018-6-1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:res/app/spring/spring-*.xml"})
public class BaseTest {

    @Test
    public void test(){

    }
}
