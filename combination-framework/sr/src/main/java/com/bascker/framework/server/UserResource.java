package com.bascker.framework.server;

import com.bascker.framework.dao.UserDao;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ResourceException;
import org.springframework.stereotype.Controller;

/**
 * User Resource
 *
 * @author bascker
 */
@Controller
public class UserResource extends UserBaseResource {

    private UserDao userDao;

    private String userId;

    @Override
    protected void doInit() throws ResourceException {
        // 从 uri template "/users/{userId}" 中获取 userId 属性值
        userId = (String) getRequest().getAttributes().get("userId");

        userDao = getDao();
    }

    /**
     * /v1/users/{userId}
     *
     * @return
     */
    @Get
    public Representation query() {
        return new JacksonRepresentation<>(userDao.query(userId));
    }

}
