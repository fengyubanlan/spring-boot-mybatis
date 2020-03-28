package com.boot.mybatis.controller;


import com.boot.mybatis.domain.User;
import com.boot.mybatis.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangjie
 * @classname UserController
 * @date 2020/03/28 0028 15:14:12
 * @description
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger  = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    private User getUser(@RequestParam Integer id){
        try{
            logger.info("id:{}",id);
            if(id==null){
              return null;
            }
            User user = userService.get(id);
            logger.info("user:{}",user);
            return user;
        }catch (Exception e){
            logger.error("getUser异常："+e.getMessage(),e);
            return null;
        }
    }
}
