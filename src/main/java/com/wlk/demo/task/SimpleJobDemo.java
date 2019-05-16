package com.wlk.demo.task;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SimpleJobDemo implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("job任务在执行"+ shardingContext.getShardingItem()+
        '-'+shardingContext.getShardingParameter());
    }
}
