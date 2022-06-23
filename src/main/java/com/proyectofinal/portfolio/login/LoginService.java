package com.proyectofinal.portfolio.login;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService {

    @Autowired
    public LoginRepository loginRepo;

    @Override
    public List<Login> verUsuarios() {
        return loginRepo.findAll();
    }

    @Override
    public void crearUsuario(Login login) {
        loginRepo.save(login);
    }

    @Override
    public Login buscarUsuario(String mail) {
        List<Login> listaUsuarios = loginRepo.findByMail(mail);
        if (!listaUsuarios.isEmpty()) {
            return listaUsuarios.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Long iniciarSesion(String mail, String password) {
        Login personaLogueada = buscarUsuario(mail);

        if (personaLogueada != null && password.equals(personaLogueada.getPassword())) {
            return personaLogueada.getPersona_id();
        } else {
            return null;
        }

    }

}
