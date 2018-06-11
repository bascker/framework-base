package com.baskcer.framework;

import com.baskcer.framework.server.UserApplication;
import org.restlet.Component;
import org.restlet.data.Protocol;

/**
 * 入口
 *
 * @author bascker
 */
public class Main {

    public static void main(String[] args) throws Exception {
        final Component component = new Component();
        component.getServers().add(Protocol.HTTP, 80);
        // 这种方式下, Application 中 Router 的 uriTemplate 才不需要加上 http://localhost
        component.getDefaultHost().attach(new UserApplication());
        component.start();
    }

}
