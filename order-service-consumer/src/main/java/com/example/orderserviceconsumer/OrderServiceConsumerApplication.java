package com.example.orderserviceconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 相当于配置包扫描： <context:component-scan base-package="com.example.orderserviceconsumer.Service.impl"></context:component-scan>
 */
@EnableDubbo
@SpringBootApplication
public class OrderServiceConsumerApplication {

    public static void main(String[] args) {

        System.out.println("访问地址：" + "http://127.0.0.1:8081/init?userId=1");
        SpringApplication.run(OrderServiceConsumerApplication.class, args);
    }

}
