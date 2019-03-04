package com.spring.IoC.di;

import com.spring.IoC.di.MessageService;

/**
 * Created by lenovo on 2019/3/4.
 */
public class MessagePrinter {
    final private MessageService service;
    public MessagePrinter(MessageService service){
        this.service=service;
    }
    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}
