package com.clp.feign.fallback;

import com.clp.entity.User;
import com.clp.feign.UserFeignClient;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2018/4/17.
 */
@Component
public class HystrixClientFallback implements UserFeignClient{

    @Override
    public List<User> getUserList() {
        System.out.print("进入熔断器==");
        return null;
    }
}
