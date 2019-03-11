package com.spring.UseDao;

import com.spring.work02.MyBeforeAdvice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeforeAdvice {
    private  static final Logger logger= LoggerFactory.getLogger(MyBeforeAdvice.class);
    public void beforAdvice(){
        logger.info("连接数据库");
    }
}
