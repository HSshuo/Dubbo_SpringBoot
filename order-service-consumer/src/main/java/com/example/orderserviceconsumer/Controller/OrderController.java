package com.example.orderserviceconsumer.Controller;

import Service.OrderService;
import bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author SHshuo
 * @data 2022/6/27--14:54
 */

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ResponseBody
    @RequestMapping("/init")
    public List<UserAddress> initOrder(String userId){
        return orderService.initOrder(userId);
    }
}
