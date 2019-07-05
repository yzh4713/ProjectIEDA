package com.example.springboot_ssm.controller;

import com.example.springboot_ssm.bean.User;
import com.example.springboot_ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * restful风格get请求
     * 根据id查询user
     *
     * @param id
     * @return
     */
    @GetMapping("/queryById/{id}")
    public User queryUserById(@PathVariable("id") int id) {

        User userById = userService.queryUserById(id);

        System.out.println("user信息为" + userById);

        return userById;

    }

    /**
     * 查询所有user
     *
     * @return
     */
    @RequestMapping("/queryAll")
    public List<User> queryAll() {

        List<User> userList = userService.queryAll();

        System.out.println(userList);

        return userList;

    }

}
