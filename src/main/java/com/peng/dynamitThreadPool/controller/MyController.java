package com.peng.dynamitThreadPool.controller;

import com.peng.dynamitThreadPool.utils.SlidingWindow;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/15 15:42
 * @Desc:
 */
@RestController
@RequestMapping("/test")
public class MyController {
    private static SlidingWindow slidingWindow = new SlidingWindow(1000, 1, 5);

    @GetMapping("/get")
    public String getInfo() {
        String res = getMsg();
        return res;
    }

    private String getMsg() {
//        if (slidingWindow.addCount(1)) {
//            return "限流了";
//        }
        return "hello";
    }
}
