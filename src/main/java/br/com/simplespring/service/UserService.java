package br.com.simplespring.service;

import br.com.simplespring.model.UserModel;
import br.com.simplespring.userRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserModel store(UserModel userModel) {
        return userRepository.save(userModel);
    }
}
