package br.com.simplespring.controller;

import br.com.simplespring.ConfigTest;
import br.com.simplespring.model.UserModel;
import br.com.simplespring.userRepository.UserRepository;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
public class UserControllerTest extends ConfigTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void shouldStore() throws Exception {
        JSONObject data = new JSONObject();
        data.put("userName", "Adenilson");

        mockMvc.perform(post("/api/user")
                .content(String.valueOf(data))
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

        List<UserModel> users = userRepository.findAll();

        Assertions.assertEquals("Adenilson", users.get(0).getUserName());
    }

}
