package com.peng.dynamitThreadPool.component;

import com.peng.dynamitThreadPool.domain.DtpThreadPoolExecutor;
import com.peng.dynamitThreadPool.registry.DtpRegistry;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/15 09:49
 * @Desc:
 */
public class DtpBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof DtpThreadPoolExecutor) {
            DtpRegistry.registry(beanName, (ThreadPoolExecutor) bean);
        }
        return bean;
    }
}
