package com.springcloud.springcloudeurekauser.dao;


import com.springcloud.springcloudeurekauser.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserDao {

    @Select("select * from tb_user where id=#{value}")
    User findById(Integer id);
}
