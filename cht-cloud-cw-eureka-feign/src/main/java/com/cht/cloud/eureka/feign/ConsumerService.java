package com.cht.cloud.eureka.feign;

import com.cht.cloud.eureka.feign.impl.ConsumerHystrixService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "COMPUTE-SERVICE", fallback = ConsumerHystrixService.class)
public interface ConsumerService {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
