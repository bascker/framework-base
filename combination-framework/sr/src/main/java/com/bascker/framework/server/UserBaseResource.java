package com.bascker.framework.server;

import com.bascker.framework.dao.UserDao;
import org.restlet.resource.ServerResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

/**
 * User Base Resource: ServerResource 应该是原型 Bean
 *
 * @author bascker
 */
@Scope("prototype")
public abstract class UserBaseResource extends ServerResource {

    @Autowired
    private UserDao userDao;

    protected UserDao getDao() {
        return userDao;
    }

}
