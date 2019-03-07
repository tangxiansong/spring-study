package com.spring.work02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello=(Hello)context.getBean(Hello.class);
        System.out.println(hello.getHello());
    }
}
