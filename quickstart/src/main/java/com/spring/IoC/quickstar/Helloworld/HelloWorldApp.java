package com.spring.IoC.quickstar.Helloworld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class HelloWorldApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldApp.class);
        HelloWorld  helloWorld = context.getBean(HelloWorld.class);
        System.out.println(helloWorld.getHello());
    }
}