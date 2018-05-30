package com.iqb.jxw.fes.filehandle.test.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hdli on 2018-5-30.
 */
public class TestListener {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:res/app/spring/spring-config.xml");

        //HelloBean hello = (HelloBean) context.getBean("helloBean");
        //hello.setApplicationContext(context);
        EmailEvent event = new EmailEvent("hello","boylmx@163.com","this is a email text!");
        context.publishEvent(event);
        //System.out.println();
    }
}
