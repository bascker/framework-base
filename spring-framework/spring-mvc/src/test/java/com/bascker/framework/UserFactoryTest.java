package com.bascker.framework;

import com.bascker.framework.util.UserFactory;
import org.powermock.core.classloader.annotations.PrepareForTest;

import static org.powermock.api.mockito.PowerMockito.mockStatic;

/**
 * UserFactory Unit Test
 *
 * @author bascker
 */
@PrepareForTest(value = UserFactory.class)
public class UserFactoryTest extends BaseTestNGSpringContextTests {

    public void testBuild() {
        mockStatic(UserFactory.class);
    }

}
