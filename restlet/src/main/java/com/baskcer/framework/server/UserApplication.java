package com.baskcer.framework.server;

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

    @Override
    public Restlet createInboundRoot() {
        final Context context = getContext();
        final Router router = new Router(context);
        router.attach("http://localhost/users/", UserResource.class);

        return router;
    }

}
