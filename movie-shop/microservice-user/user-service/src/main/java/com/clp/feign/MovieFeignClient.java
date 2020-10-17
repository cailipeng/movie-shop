package com.clp.feign;

import com.clp.entity.Movie;
import com.clp.feign.fallback.HystrixClientFallback;
import com.sun.org.apache.xml.internal.serialize.Method;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


/**
 * 电影声明式服务
 */
@FeignClient(name="microservice-movie",fallback = HystrixClientFallback.class)
public interface MovieFeignClient {
    @RequestMapping(value = "/movie/getmovielist",method= RequestMethod.GET)
    public List<Movie> getMovieList();
}
