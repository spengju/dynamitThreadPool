package com.peng.dynamitThreadPool;

import com.peng.dynamitThreadPool.annotation.EnableDynamicThreadPool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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
//        LinkedList<Object> list = new LinkedList<>();
//        ArrayList<Object> list1 = new ArrayList<>();
//        Map<String, String> hashMap = new HashMap<>();
////        hashMap.put("name1", "spengju");
//        for (int i = 0; i < 16; i++) {
//            hashMap.put("name" + i, String.valueOf(i));
//        }
//        System.out.println(hashMap.get("name"));
//
//        Map<Object, Object> concurrentHashMap = new ConcurrentHashMap<>();
//        concurrentHashMap.put("aa","bb");
    }
}