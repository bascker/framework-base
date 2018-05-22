package com.bascker.framework.dao;

import com.bascker.framework.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * DB, 充当数据库角色
 *
 * @author bascker
 */
public class DB {

    public static final Map<String, User> USER = new HashMap<>();

    private DB() {}

}
