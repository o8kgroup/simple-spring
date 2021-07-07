package br.com.simplespring.controller;

import br.com.simplespring.controller.converter.UserConverter;
import br.com.simplespring.dto.UserDTO;
import br.com.simplespring.model.UserModel;
import br.com.simplespring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserConverter userConverter;

    @PostMapping
    public UserDTO store(@RequestBody UserDTO userDTO) {
        UserModel userModel = userConverter.toModel(userDTO);

        return userConverter.toDTO(userService.store(userModel));
    }
}
