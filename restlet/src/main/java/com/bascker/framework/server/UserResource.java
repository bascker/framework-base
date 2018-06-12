package com.bascker.framework.server;

import com.bascker.framework.dao.UserDao;
import com.bascker.framework.model.User;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ResourceException;

/**
 * User Resource
 *
 * @author bascker
 */
public class UserResource extends UserBaseResource {

    private UserDao userDao;

    private String userId;

    @Override
    protected void doInit() throws ResourceException {
        // 从 uri template "/users/{userId}" 中获取 userId 属性值
        userId = (String) getRequest().getAttributes().get("userId");

        userDao = getDao();
    }

    @Get
    public Representation query() {
        final JacksonRepresentation<User> representation = new JacksonRepresentation<>(userDao.query(userId));
        return representation;
    }

}
