package com.cht.cloud.eureka.feign.impl;

import com.cht.cloud.eureka.feign.ConsumerService;
import org.springframework.stereotype.Component;

@Component
public class ConsumerHystrixService implements ConsumerService{
    @Override
    public Integer add(Integer a, Integer b) {
        return -9999;
    }
}
