package com.proyectofinal.portfolio.login;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "*")

public class LoginController {

    @Autowired
    private ILoginService loginServ;

    @PostMapping("/nuevo")
    public void crearUsuario(@RequestBody Login login) {
        loginServ.crearUsuario(login);
    }

    @PostMapping("")
    public ResponseEntity<Long> iniciarSesion(@RequestBody Credenciales usuario) {
        var id = loginServ.iniciarSesion(usuario.getMail(), usuario.getPassword());
        if (id != null) {
            return ResponseEntity.status(HttpStatus.OK).body(id);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Login> verUsuarios() {
        return loginServ.verUsuarios();
    }

}
