package com.baskcer.framework.server;

import com.baskcer.framework.dao.UserDao;
import com.baskcer.framework.dao.impl.UserDaoImpl;
import com.baskcer.framework.model.User;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import java.util.List;

/**
 * User Resource
 *
 * @author bascker
 */
public class UserResource extends ServerResource {

    private UserDao userDao = new UserDaoImpl();

    @Get
    public Representation list() {
        final List<User> users = userDao.list();
        return new JacksonRepresentation<>(users);
    }

}
