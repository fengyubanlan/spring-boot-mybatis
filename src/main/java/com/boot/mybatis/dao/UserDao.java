package com.boot.mybatis.dao;

import com.boot.mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 11329
 */
@Mapper
public interface UserDao {
    /**
     * 根据id查询User
     * @param id 主键id
     * @return User
     */
    User get(Integer id);
}
