package com.bascker.framework.util;

import com.bascker.framework.model.User;

/**
 * User Factory
 *
 * @author bascker
 */
public class UserFactory {

    private static final UserFactory instance = new UserFactory();

    public User createUser(final String name) {
        return new User(name);
    }

    public static UserFactory getInstance() {
        return instance;
    }

    private UserFactory() {}

}
