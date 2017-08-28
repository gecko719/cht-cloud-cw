package com.cht.cloud.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.config.environment.PropertySource;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RefreshScope
@RestController
@RequestMapping(value = "/api/test")
public class ApiTestController {

    @Value("${from}")
    private String from;

    @Autowired
    private Environment env;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String doTest() {
//        return this.from;
//        List<PropertySource> list = env.getPropertySources();
        return  env.getProperty("from");
    }
}
