package com.spring.IoC.di;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;;
/**
 * Created by lenovo on 2019/3/4.
 */
public class Application {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
                ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        MessagePrinter printer=context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
