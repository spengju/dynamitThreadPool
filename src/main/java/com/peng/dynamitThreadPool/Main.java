package com.peng.dynamitThreadPool;

import com.peng.dynamitThreadPool.annotation.EnableDynamicThreadPool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/15 09:42
 * @Desc: $description
 */
@SpringBootApplication
@EnableDynamicThreadPool
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        Object bean = context.getBean("dtpExecutor1");
        System.out.println(bean);
    }


}