package com.bascker.framework;

import org.mockito.MockitoAnnotations;
import org.powermock.modules.testng.PowerMockObjectFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.IObjectFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

/**
 * 基础父类, 进行共性操作, 所有测试类都继承该类
 *
 * @author bascker
 */
@Test
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class BaseTestNGSpringContextTests extends AbstractTestNGSpringContextTests {

    @BeforeMethod(alwaysRun = true)
    protected void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @ObjectFactory
    protected IObjectFactory getObjectFactory() {
        return new PowerMockObjectFactory();
    }

}
