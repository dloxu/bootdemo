package com.dloading.bootdemo.mapper;


import com.dloading.bootdemo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Dloading
 * @since 2019/12/18
 *
 */
@Repository
public interface UserMapper {

    User findByUserName(String username);

    void createUser(User user);
}
