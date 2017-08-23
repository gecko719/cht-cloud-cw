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