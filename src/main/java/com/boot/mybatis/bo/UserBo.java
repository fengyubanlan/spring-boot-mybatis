package com.boot.mybatis.bo;

import com.boot.mybatis.service.UserService;
import com.boot.mybatis.dao.UserDao;
import com.boot.mybatis.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yangjie
 * @classname UserBo
 * @date 2020/03/27 0027 18:44:13
 * @description
 **/
@Service
public class UserBo implements UserService {

    @Autowired
    private UserDao UserDao;

    @Override
    public User get(Integer id) {
        return UserDao.get(id);
    }
}
