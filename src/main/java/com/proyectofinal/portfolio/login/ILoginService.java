package com.proyectofinal.portfolio.login;

import java.util.List;

public interface ILoginService {

    public List<Login> verUsuarios();

    public void crearUsuario(Login login);

    public Login buscarUsuario(String mail);

    public Long iniciarSesion(String mail, String password);

}
