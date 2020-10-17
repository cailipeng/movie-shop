package com.clp.dao;

import com.clp.entity.User;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface UserMapper {

    public List<User> getUserList();
}
