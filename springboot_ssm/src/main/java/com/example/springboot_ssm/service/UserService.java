package com.example.springboot_ssm.service;

import com.example.springboot_ssm.bean.User;
import com.example.springboot_ssm.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //把service层注入spring容器
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据 id 查询user
     *
     * @param id
     * @return
     */
    public User queryUserById(int id) {
        return userMapper.queryUserById(id);
    }

    /**
     * 查询所有user
     *
     * @return
     */
    public List<User> queryAll() {
        return userMapper.queryAll();
    }

    /**
     * 设置翻页
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    public List<User> queryLimit(int pageNo, int pageSize) {

        //设置第几页和每页的大小
        PageHelper.startPage(pageNo, pageSize);

        return userMapper.queryAll();

    }
}
