package com.wlk.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    /**
     * ioc容器
     */
    @Autowired
    ApplicationContext applicationContext;

    /**
     * log日志记录器
     */
    Logger logger = LoggerFactory.getLogger(getClass());


    @Test
    public void contextLoads() {
        boolean helloService = applicationContext.containsBean("helloService");
        logger.info("测试日志信息");
        System.out.println(helloService);
    }




    @Test
    public void testLog(){

        // 日志的级别 trace < debug < info < warn < error
        logger.trace("这是trace日志");
        logger.debug("这是debug日志");
        // springboot默认是info的级别
        logger.info("这是info日志");
        logger.warn("这是warn日志");
        logger.error("这是errir日志");


    }



}
