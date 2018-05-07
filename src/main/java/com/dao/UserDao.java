package com.dao;

import com.entity.User;

import java.util.List;

/**
 * Created by zr on 2018/5/7.
 */
public interface UserDao {
    /**
     * 插入用户记录
     * @param user
     * @return
     */
    Integer insert(User user);

    /**
     * 删除用户记录
     * @param id
     * @return
     */
    Integer delete(Integer id);

    /**
     * 更新用户记录
     * @param user
     * @return
     */
    Integer update(User user);

    /**
     * 根据username查找用户
     * @param user
     * @return
     */
    User queryByUsername(User user);

    /**
     * 查询全部用户
     * @return
     */
    List<User> queryAll();
}
