package com.proyectofinal.portfolio.titulo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/titulo")
@CrossOrigin(origins = "*")

public class TituloController {

    @Autowired
    private ITituloService tituloServ;

    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Titulo buscarTitulo(@PathVariable Long id) {
        return tituloServ.buscarTitulo(id);
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Titulo> verTitulos() {
        return tituloServ.verTitulos();
    }

}
