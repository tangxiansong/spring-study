package com.spring.IoC.quickstar.Helloworld;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Phone {
    //通过@Value注解给简单类型赋值
    @Value("iPhoneX")
    private String brand;

    @Value("6666.66")
    private double price;

    public Phone(String brand, String price) {
    }
}
