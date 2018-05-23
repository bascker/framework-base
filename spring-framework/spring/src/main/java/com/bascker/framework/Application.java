package com.bascker.framework;

import com.bascker.framework.model.Sex;
import com.bascker.framework.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application
 *
 * @author bascker
 */
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        // 实例化 Spring 容器: 也可以直接使用 beans.xml
        final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取 Bean
        final User user = (User) context.getBean("user");
        user.setName("bascker");
        user.setSex(Sex.MALE);
        LOGGER.info(user.toString());
    }

}
