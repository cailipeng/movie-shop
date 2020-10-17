package com.clp.feign;

import com.clp.entity.User;
import com.clp.feign.fallback.HystrixClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 用户声明式服务
 */
@FeignClient(name="microservice-user",fallback = HystrixClientFallback.class)
public interface UserFeignClient {
    @RequestMapping(value = "/getuserlist",method = RequestMethod.GET)
    public List<User> getUserList();
}
