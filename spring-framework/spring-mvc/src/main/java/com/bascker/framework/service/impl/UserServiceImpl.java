package com.bascker.framework.service.impl;

import com.bascker.framework.dao.UserDao;
import com.bascker.framework.model.User;
import com.bascker.framework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User Service
 *
 * @author bascker
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User get(final String id) {
        return userDao.query(id);
    }

}
