package br.com.simplespring.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UserModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_name")
    private String userName;

}
