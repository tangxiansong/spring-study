package com.spring.UseDao;

import com.spring.work02.MyBeforeAdvice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDaoImpl implements UserDao {
    private static final Logger logger= LoggerFactory.getLogger(MyBeforeAdvice.class);
    @Override
    public void insert() {
        logger.info("开始进行插入操作");

    }
}
