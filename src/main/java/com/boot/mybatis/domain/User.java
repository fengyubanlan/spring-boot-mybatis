package com.boot.mybatis.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author yangjie
 * @classname User
 * @date 2020/03/27 0027 18:33:51
 * @description
 **/
@Setter
@Getter
@ToString
public class User {
    private Integer id;
    private String userName;
    private String password;
    private Integer sex;
    private Date lastLoginTime;
}
