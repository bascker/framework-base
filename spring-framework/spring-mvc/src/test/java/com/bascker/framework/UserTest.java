package com.bascker.framework;

import com.bascker.framework.model.User;
import com.bascker.framework.util.UserFactory;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mockingDetails;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Spring Test & TestNG & PowerMock 集成测试
 *
 * @author bascker
 */
public class UserTest extends BaseTestNGSpringContextTests {

    @Autowired
    private User user;

    @Mock
    private UserFactory factory;

    @PrepareForTest(value = {UserFactory.class})
    public void testBuild() {
        mockStatic(UserFactory.class);

        when(UserFactory.getInstance()).thenReturn(factory);
        assertTrue(mockingDetails(UserFactory.getInstance()).isMock());

        final String bascker = "bascker";
        when(factory.createUser(anyString())).thenReturn(new User(bascker));

        final User rs = user.build("paul");
        assertEquals(rs.getName(), bascker);
    }

}
