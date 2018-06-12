package com.bascker.framework.dao;

import com.bascker.framework.model.User;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * User Dao
 */
public interface UserDao {

    ConcurrentMap<String, User> DB = new ConcurrentHashMap<>();

    List<User> list();

    User query(final String id);

}
