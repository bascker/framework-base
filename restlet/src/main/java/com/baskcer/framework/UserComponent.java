package com.baskcer.framework;

import com.baskcer.framework.server.UserApplication;
import org.restlet.Component;
import org.restlet.Server;
import org.restlet.data.Protocol;

/**
 * 入口
 *
 * @author bascker
 */
public class UserComponent extends Component {

    public static void main(String[] args) throws Exception {
        final Server server = new Server(Protocol.HTTP, 80);
        server.setNext(new UserApplication());
        server.start();
    }
}
