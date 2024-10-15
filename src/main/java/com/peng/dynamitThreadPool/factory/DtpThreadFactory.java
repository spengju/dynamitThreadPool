package com.peng.dynamitThreadPool.factory;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/15 09:58
 * @Desc:
 */
public class DtpThreadFactory implements ThreadFactory {
    private final AtomicInteger i = new AtomicInteger(1);
    @Override
    public Thread newThread(Runnable r) {
        //创建线程
        Thread thread = new Thread(r);
        //设置线程名称
        thread.setName("线程"+i.getAndIncrement());
        return thread;
    }
}
