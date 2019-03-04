package com.spring.IoC.di;

import com.spring.IoC.di.MessageService;

/**
 * Created by lenovo on 2019/3/4.
 */
public class MessageServiceImpl implements MessageService{
    private String username;
    private int age;

    public MessageServiceImpl(String username, int age) {
        this.username = username;
        this.age = age;
    }

   public String getMessage(){
        return "Hello world"+username+",age is"+age;
   }
}

