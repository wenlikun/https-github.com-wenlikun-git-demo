package com.wlk.demo.config;

import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticRegCenterConfig {

    @Bean(initMethod = "init")
    public ZookeeperRegistryCenter regCenter(
        @Value("${regCenter.serverList}") final String serverList,
        @Value("${regCenter.namespace}") final String namespace){
        return new ZookeeperRegistryCenter(new ZookeeperConfiguration(serverList , namespace));
    }

}
