package com.wlk.demo.config;

import com.wlk.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 指明当前类就是一个配置类替代spring的配置文件
 */
@Configuration
public class MyDemoConfig {

    /**
     * 默认方法名就是容器中id
     * @return
     */
    @Bean
    public HelloService helloService(){
        System.out.println("@Bean注解给容器中添加组件");
        return new HelloService();
    }

}
