package com.peng.dynamitThreadPool.properties;

import lombok.Data;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/15 09:51
 * @Desc:
 */
@Data
public class ThreadPoolProperties implements ThreadFactory {
    private final AtomicInteger i = new AtomicInteger(1);
    /**
     * 标识每个线程池的唯一名字
     */
    private String poolName;
    private String poolType = "common";

    /**
     * 是否为守护线程
     */
    private boolean isDaemon = false;

    /**
     * 以下都是核心参数
     */
    private int corePoolSize = Runtime.getRuntime().availableProcessors() + 1;

    private int maximumPoolSize = Runtime.getRuntime().availableProcessors() * 2;

    private long keepAliveTime;

    private TimeUnit timeUnit = TimeUnit.SECONDS;

    private String queueType = "arrayBlockingQueue";

    private int queueSize = 10;

    private String threadFactoryPrefix = "-td-";

    private String RejectedExecutionHandler;

    @Override
    public Thread newThread(Runnable r) {
        //创建线程
        Thread thread = new Thread(r);
        //设置线程名称
        thread.setName(poolName + threadFactoryPrefix + i.getAndIncrement());
        return thread;
    }
}
