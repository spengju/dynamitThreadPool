package com.peng.dynamitThreadPool.properties;

import lombok.Data;

import java.util.List;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/15 10:22
 * @Desc:
 */
@Data
public class DtpProperties {

    private List<ThreadPoolProperties> executors;
}
