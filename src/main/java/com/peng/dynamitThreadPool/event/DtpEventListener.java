package com.peng.dynamitThreadPool.event;

import com.peng.dynamitThreadPool.properties.ThreadPoolProperties;
import com.peng.dynamitThreadPool.registry.DtpRegistry;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/15 11:04
 * @Desc:
 */
@Component
public class DtpEventListener {//}  implements ApplicationListener<OrderEvent> {

    // 基于注解的
    @EventListener(DtpEvent.class)
    public void onApplicationEvent(DtpEvent event) {
        ThreadPoolProperties properties = event.getProperties();
        DtpRegistry.refresh(properties.getPoolName(),properties);
    }

}
