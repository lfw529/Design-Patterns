package com.lfw.controller;

import com.lfw.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        //创建spring容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        //从IOC容器中获取UserService对象
        UserService userService = applicationContext.getBean("userService", UserService.class);
        //调用UserService对象的add方法
        userService.add();
    }
}
