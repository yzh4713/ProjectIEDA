package com.example.springboot_ssm.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //包括get/set/toString
@AllArgsConstructor //有参构造
@NoArgsConstructor //无参构造

public class User {

    private int id;

    private String username;

    private int sex;

    private String address;

}
