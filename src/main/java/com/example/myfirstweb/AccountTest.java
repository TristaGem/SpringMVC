package com.example.myfirstweb;

import com.example.myfirstweb.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountTest {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        userService.transferMoney("tom", "lucy", 500);
//        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
//        accountMapper.incrMoney("tom", 10);
    }
}
