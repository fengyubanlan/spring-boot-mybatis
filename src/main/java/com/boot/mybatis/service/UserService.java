package com.boot.mybatis.service;

import com.boot.mybatis.domain.User;

/**
 * @author 11329
 */
public interface UserService {
    /**
     * 根据ID查询User
     * @param id
     * @return User
     */
    User get(Integer id);
}
