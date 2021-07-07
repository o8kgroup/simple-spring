package br.com.simplespring.controller.converter;

import br.com.simplespring.dto.UserDTO;
import br.com.simplespring.model.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserModel toModel(UserDTO userDTO) {
        UserModel userModel = new UserModel();
        userModel.setUserName(userDTO.getUserName());

        return userModel;
    }

    public UserDTO toDTO(UserModel userModel) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserName(userModel.getUserName());
        userDTO.setId(userModel.getId());

        return userDTO;
    }
}
