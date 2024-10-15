package com.peng.dynamitThreadPool.domain;

import com.peng.dynamitThreadPool.properties.ThreadPoolProperties;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/15 09:50
 * @Desc:
 */
public class DtpThreadPoolExecutor extends ThreadPoolExecutor {
    public DtpThreadPoolExecutor(ThreadPoolProperties properties) {
        super(
                properties.getCorePoolSize(),
                properties.getMaximumPoolSize(),
                properties.getKeepAliveTime(),
                properties.getTimeUnit(),
                new ArrayBlockingQueue<>(properties.getQueueSize()),
                properties
        );
    }
}
