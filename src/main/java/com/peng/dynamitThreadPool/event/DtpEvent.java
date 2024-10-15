package com.peng.dynamitThreadPool.event;

import com.peng.dynamitThreadPool.properties.ThreadPoolProperties;
import org.springframework.context.ApplicationEvent;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/15 10:16
 * @Desc:
 */
public class DtpEvent  extends ApplicationEvent {

    private ThreadPoolProperties properties;

    public DtpEvent(ThreadPoolProperties properties) {
        super(properties);
        this.properties = properties;
    }

    public ThreadPoolProperties getProperties() {
        return properties;
    }
}
