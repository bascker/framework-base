package com.baskcer.framework.dao;

import com.baskcer.framework.model.User;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * User Dao
 */
public interface UserDao {

    Map<String, User> DB = new ConcurrentHashMap<>();

    List<User> list();

}
