package com.bascker.framework.dao;

import com.bascker.framework.model.User;

/**
 * User Dao
 *
 * @author bascker
 */
public interface UserDao {

    User query(final String id);

}