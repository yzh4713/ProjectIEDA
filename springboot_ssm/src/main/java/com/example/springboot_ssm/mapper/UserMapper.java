package com.example.springboot_ssm.mapper;

import com.example.springboot_ssm.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 通过id查询  user
     *
     * @param id
     * @return
     */
    public User queryUserById(int id);

    /**
     * 查询所有user
     *
     * @return
     */
    public List<User> queryAll();

}
