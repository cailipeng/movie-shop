package com.clp.feign.fallback;

import com.clp.entity.Movie;
import com.clp.feign.MovieFeignClient;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * HystrixFallback
 */
@Component
public class HystrixClientFallback implements MovieFeignClient{
    @Override
    public List<Movie> getMovieList() {
        System.out.print("进入熔断器==");
        return null;
    }
}
