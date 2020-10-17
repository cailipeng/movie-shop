package com.clp.controller;

import com.clp.entity.Movie;
import com.clp.entity.User;
import com.clp.feign.MovieFeignClient;
import com.clp.service.UserService;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户微服务模块
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private MovieFeignClient movieFeignClient;

    @GetMapping("/getuserlist")
    public List<User> getUserList(){
        return userService.getUserList();
    }
    @GetMapping("/getmovielist")
    public List<Movie> getMovieList(){
        return movieFeignClient.getMovieList();
    }
}
