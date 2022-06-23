package com.proyectofinal.portfolio.tipo_empleo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipoempleo")
@CrossOrigin(origins = "*")

public class TipoEmpleoController {

    @Autowired
    private ITipoEmpleoService empleoServ;

    @GetMapping("/buscar/{id}")
    @ResponseBody
    public TipoEmpleo buscarTipo(@PathVariable Long id) {
        return empleoServ.buscarTipo(id);
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<TipoEmpleo> verTipos() {
        return empleoServ.verTipos();
    }

}
