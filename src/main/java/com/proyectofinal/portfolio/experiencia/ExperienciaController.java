package com.proyectofinal.portfolio.experiencia;

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
@RequestMapping("/experiencia")
@CrossOrigin(origins = "*")

public class ExperienciaController {

    @Autowired
    private IExperienciaService expServ;

    @PostMapping("/nueva")
    public void agregarExperiencia(@RequestBody Experiencia exp) {
        expServ.crearExperiencia(exp);
    }

    @GetMapping("buscar/{id}")
    @ResponseBody
    public Experiencia buscarExperiencia(@PathVariable Long id) {
        return expServ.buscarExperiencia(id);
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Experiencia> verExperiencias() {
        return expServ.verExperiencias();
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarExperiencia(@PathVariable Long id) {
        expServ.borrarExperiencia(id);
    }

    @PutMapping("/editar/{id}")
    public void editarExperiencia(@PathVariable Long id, @RequestBody Experiencia exp) {
        exp.setId(id);
        expServ.crearExperiencia(exp);
    }

}
