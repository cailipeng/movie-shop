package com.clp.controller;


import com.clp.entity.Movie;
import com.clp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 电影微服务
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    /**
     * 获取电影列表数据
     * @return
     */
    @GetMapping("/getmovielist")
    public List<Movie> getMovieList(){
        return movieService.getMovieList();
    }
}
