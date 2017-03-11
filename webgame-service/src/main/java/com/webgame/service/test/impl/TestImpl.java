package com.webgame.service.test.impl;

import com.webgame.dal.user.dao.UserDAO;
import com.webgame.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Zeus Feng on 2017/3/12.
 *
 * @author Zeus Feng
 * @date 2017/03/12
 */
@Component
public class TestImpl implements TestService{
    @Autowired
    UserDAO userDAO;

    public String getTest() {
        return String.valueOf(userDAO.count());
    }
}
