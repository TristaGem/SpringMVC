package com.example.myfirstweb.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ContextLoaderListener init....");
        String contextPath  = sce.getServletContext().getInitParameter("contextConfigLocation");
        contextPath = contextPath.substring("classpath:".length());
        // 1. create the spring container
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(contextPath);
        // 2. store the container into the servlet Context scope
        sce.getServletContext().setAttribute("application", applicationContext);
    }
}
