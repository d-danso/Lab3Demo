package com.Exercise3;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import com.Exercise4.User;
import com.Exercise4.UserRepository;
import com.Exercise4.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void testCreateUser() {

        User user = new User(null, "Default Name", "default@example.com");;
        when(userRepository.save(user)).thenReturn(user);


        User result = userService.createUser(user);


        assertEquals(user, result);
    }
}
