package com.bascker.framework.server;

import com.bascker.framework.dao.UserDao;
import com.bascker.framework.model.User;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ResourceException;
import org.springframework.stereotype.Controller;

import java.io.IOException;
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

    /**
     * POST /v1/users
     *
     * @param entity    存储请求数据的实体
     * @return
     * @throws IOException
     */
    @Post
    public void store(final Representation entity) throws IOException {
        // 将接受到的 Json 对象，直接转为对应的 Java 对象
        final JacksonRepresentation<User> repre = new JacksonRepresentation<>(entity, User.class);
        final User user = repre.getObject();
        userDao.save(user);
    }

}