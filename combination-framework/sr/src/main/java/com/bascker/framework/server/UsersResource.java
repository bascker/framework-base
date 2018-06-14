package com.bascker.framework.server;

import com.bascker.framework.dao.UserDao;
import com.bascker.framework.model.User;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ResourceException;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Users Resource
 *
 * @author bascker
 */
@Controller
public class UsersResource extends UserBaseResource {

    private UserDao userDao;

    @Override
    protected void doInit() throws ResourceException {
        userDao = getDao();
    }

    /**
     * /v1/users
     *
     * @return
     */
    @Get
    public Representation list() {
        final List<User> users = userDao.list();
        return new JacksonRepresentation<>(users);
    }

}
