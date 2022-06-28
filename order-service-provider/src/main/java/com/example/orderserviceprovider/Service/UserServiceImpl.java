package com.example.orderserviceprovider.Service;

import Service.UserService;
import bean.UserAddress;
import com.alibaba.dubbo.config.annotation.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author SHshuo
 * @data 2022/6/27--14:44
 *
 * @Service：暴露服务
 */

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress1 = new UserAddress(1, "吉林省长春市榆树市富裕花园", "1", "李老师", "11111111111", "1");
        UserAddress userAddress2 = new UserAddress(2, "吉林省长春市朝阳区硅谷大街香榭湾", "1", "黄老师", "22222222222", "0");

        return Arrays.asList(userAddress1, userAddress2);
    }
}
