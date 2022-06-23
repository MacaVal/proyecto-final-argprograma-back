package com.proyectofinal.portfolio.educacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = "*")

public class EducacionController {

    @Autowired
    private IEducacionService eduServ;

    @PostMapping("/nuevo")
    public void agregarEstudio(@RequestBody Educacion edu) {
        eduServ.crearEstudio(edu);
    }

    @GetMapping("buscar/{id}")
    @ResponseBody
    public Educacion buscarEstudio(@PathVariable Long id) {
        return eduServ.buscarEstudio(id);
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return eduServ.verEducacion();
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarEstudio(@PathVariable Long id) {
        eduServ.borrarEstudio(id);
    }

    @PutMapping("/editar/{id}")
    public void editarEstudio(@PathVariable Long id, @RequestBody Educacion edu) {
        edu.setId(id);
        eduServ.crearEstudio(edu);
    }

}
