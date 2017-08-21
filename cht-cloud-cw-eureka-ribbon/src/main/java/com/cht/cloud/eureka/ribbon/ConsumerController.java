package com.cht.cloud.eureka.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return this.consumerService.doAdd();
    }
}
