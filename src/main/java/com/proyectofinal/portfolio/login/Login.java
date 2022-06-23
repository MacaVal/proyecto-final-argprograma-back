package com.proyectofinal.portfolio.login;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String mail;
    private String password;
    private Long persona_id;

    public Login() {
    }

    public Login(Long id, String mail, String password, Long persona_id) {
        this.id = id;
        this.mail = mail;
        this.password = password;
        this.persona_id = persona_id;
    }

}
