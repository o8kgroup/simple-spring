package br.com.simplespring.service;

import br.com.simplespring.model.UserModel;
import br.com.simplespring.userRepository.UserRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @Test
    public void store() {
        UserModel userModel = new UserModel();
        userModel.setUserName("Test");

        when(userRepository.save(any())).thenReturn(userModel);

        UserModel user = userService.store(userModel);

        Assertions.assertNotNull(user);
    }
}
