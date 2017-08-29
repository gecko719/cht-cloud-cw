#注意事項

### cht-cloud-cw-eureka

### cht-cloud-cw-eureka-client

### cht-cloud-cw-eureka-ribbon

### cht-cloud-cw-eureka-feign
需在application.yaml增加下列設定，以啟用Hystrix - circuit breaker功能
~~~
feign:
  hystrix:
    enabled: true
~~~

### cht-cloud-cw-config-server
讀取本機resources/properties,yaml檔
~~~
spring:
  profiles:
    active: native
~~~

透過POSTMAN檢視config檔
~~~
    GET http://ip:port/{config-name}/{env-profile}
    (http://127.0.0.1:7001/didispace/production
~~~
    
### cht-cloud-cw-config-client
增加dependency，才可使用/refresh刷新API
~~~
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
~~~

需在application.yaml增加下列設定，以關閉security，才可以POST呼叫http://ip:port/refresh刷新properties數值
~~~
management:
  security:
    enabled: false
~~~