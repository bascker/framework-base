package com.baskcer.framework.server;

import com.baskcer.framework.dao.UserDao;
import org.restlet.resource.ServerResource;

/**
 * User Base Resource
 *
 * @author bascker
 */
public abstract class UserBaseResource extends ServerResource {

    protected UserDao getDao() {
        final UserApplication application = (UserApplication) getApplication();
        return application.getDao();
    }

}
