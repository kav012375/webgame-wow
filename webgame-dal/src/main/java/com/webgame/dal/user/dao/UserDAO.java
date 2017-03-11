package com.webgame.dal.user.dao;

import com.webgame.dal.user.entity.UserDO;

/**
 * Created by Zeus Feng on 2017/3/12.
 *
 * @author Zeus Feng
 * @date 2017/03/12
 */
public interface UserDAO {
    UserDO findAll();
    int count();
    void InsertNewUser(UserDO userDO);
    UserDO FindUserInfoByUserAcct(String uacct);
}
