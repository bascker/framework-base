package com.bascker.framework.dao.impl;

import com.bascker.framework.dao.DB;
import com.bascker.framework.dao.UserDao;
import com.bascker.framework.model.Sex;
import com.bascker.framework.model.User;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.Objects;

/**
 * User Dao
 *
 * @author bascker
 */
@Repository
public class UserDaoImpl implements UserDao {

    private Map<String, User> USER = DB.USER;

    @PostConstruct
    private void init() {
        USER.put("1", new User.Builder()
                .setId("1").setAge(24).setName("bascker").setSex(Sex.MALE)
                .build());
    }

    @Override
    public User query(final String id) {
        if (Objects.nonNull(id)) {
            return USER.getOrDefault(id, null);
        }

        return null;
    }

}
