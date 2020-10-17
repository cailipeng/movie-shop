package com.clp.dao;

import com.clp.entity.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/5/3.
 */
@Repository
public interface MovieMapper {
    /**
     * 获取电影信息列表
     * @return
     */
    public List<Movie> getMovieList();
}
