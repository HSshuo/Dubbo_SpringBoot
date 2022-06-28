package Service;

import bean.UserAddress;

import java.util.List;

/**
 * @author SHshuo
 * @data 2022/6/24--17:25
 */
public interface OrderService {
    /***
     * 初始化订单信息
     * @return
     */
    public List<UserAddress> initOrder(String userId);
}
