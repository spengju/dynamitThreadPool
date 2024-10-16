package com.peng.dynamitThreadPool;

import com.peng.dynamitThreadPool.utils.SlidingWindow;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/15 18:01
 * @Desc:
 */
@Configuration
public class CustomDispatchServlet extends DispatcherServlet {
    private static SlidingWindow slidingWindow = new SlidingWindow(1000, 1, 5);

    @Override
    protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("11111");
        if (slidingWindow.addCount(1)) {
            System.out.println("限流了");
        }
        super.doDispatch(request, response);
    }

    @Bean
    public ServletRegistrationBean<CustomDispatchServlet> dispatcherServletRegistration(CustomDispatchServlet customDispatchServlet) {
        ServletRegistrationBean<CustomDispatchServlet> registrationBean =
                new ServletRegistrationBean<>(customDispatchServlet, "/*");

        registrationBean.setName("customDispatchServlet");
        return registrationBean;
    }

    // 显式定义 DispatcherServletPath
    @Bean
    public DispatcherServletPath dispatcherServletPath() {
        // 设置 DispatcherServlet 的路径，这里设置为默认路径 "/"
        return () -> "/";
    }
}
