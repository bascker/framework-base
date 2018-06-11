package com.baskcer.framework.server;

import com.baskcer.framework.dao.UserDao;
import com.baskcer.framework.model.User;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ResourceException;

import java.util.List;

/**
 * Users Resource
 *
 * @author bascker
 */
public class UsersResource extends UserBaseResource {

    private UserDao userDao;

    @Override
    protected void doInit() throws ResourceException {
        userDao = getDao();
    }

    @Get
    public Representation list() {
        final List<User> users = userDao.list();
        return new JacksonRepresentation<>(users);
    }

}
