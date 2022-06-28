package com.example.orderserviceconsumer.Service;

import bean.UserAddress;
import Service.OrderService;
import Service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author SHshuo
 * @data 2022/6/27--14:42
 */
@Service
public class OrderServiceImpl implements OrderService {

    /**
     * 使用注解reference绑定暴露的服务
     */
    @Reference
    UserService service;

    @Override
    public List<UserAddress> initOrder(String userId) {
//        1、查询用户的信息，需要调用另一个服务，service就是服务暴露的接口，已经声明可以远程调用
        List<UserAddress> userAddressList = service.getUserAddressList(userId);

        return userAddressList;
    }
}