package com.baskcer.framework.server;

import com.baskcer.framework.dao.UserDao;
import com.baskcer.framework.dao.impl.UserDaoImpl;
import org.restlet.Application;
import org.restlet.Context;
import org.restlet.Restlet;
import org.restlet.routing.Router;

/**
 * User Application
 *
 * @author bascker
 */
public class UserApplication extends Application {

    private final UserDao userDao = new UserDaoImpl();

    @Override
    public Restlet createInboundRoot() {
        final Context context = getContext();
        final Router router = new Router(context);
        router.attach("/users", UsersResource.class);
        router.attach("/users/{userId}", UserResource.class);

        return router;
    }

    public UserDao getDao() {
        return userDao;
    }

}
