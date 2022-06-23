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
public class Credenciales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String mail;
    private String password;

    public Credenciales() {

    }

    public Credenciales(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

}
