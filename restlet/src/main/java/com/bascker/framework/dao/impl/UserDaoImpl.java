package com.bascker.framework.dao.impl;

import com.bascker.framework.dao.UserDao;
import com.bascker.framework.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * UserDao Implement
 *
 * @author bascker
 */
public class UserDaoImpl implements UserDao {

    static {
        DB.put("1", new User("1", "bascker"));
        DB.put("2", new User("2", "paul"));
        DB.put("3", new User("3", "lisa"));
    }

    @Override
    public List<User> list() {
        final List<User> users = new ArrayList<>();
        users.addAll(DB.values());

        return users;
    }

    @Override
    public User query(final String id) {
        return DB.getOrDefault(id, null);
    }
}
