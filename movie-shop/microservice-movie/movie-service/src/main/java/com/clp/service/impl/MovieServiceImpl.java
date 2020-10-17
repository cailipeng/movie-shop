package com.clp.service.impl;

import com.clp.dao.MovieMapper;


import com.clp.entity.Movie;
import com.clp.redis.RedisService;
import com.clp.service.MovieService;
import com.clp.utils.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Set;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieMapper movieMapper;
    @Autowired
    private RedisService redisService;

    @Override
    public List<Movie> getMovieList() {
        List<Movie>  movieList=movieMapper.getMovieList();
        redisService.set("movieTest","testSuccess");
        System.out.println(redisService.get("movieTest"));
        return movieList;
    }

}
