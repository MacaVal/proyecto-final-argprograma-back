package com.proyectofinal.portfolio.proyectos;

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
@RequestMapping("/proyectos")
@CrossOrigin(origins = "*")

public class ProyectosController {

    @Autowired
    private IProyectosService proServ;

    @PostMapping("/nuevo")
    public void agregarProyecto(@RequestBody Proyectos pro) {
        proServ.crearProyecto(pro);
    }

    @GetMapping("buscar/{id}")
    @ResponseBody
    public Proyectos buscarProyecto(@PathVariable Long id) {
        return proServ.buscarProyecto(id);
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Proyectos> verProyectos() {
        return proServ.verProyectos();
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarProyecto(@PathVariable Long id) {
        proServ.borrarProyecto(id);
    }

    @PutMapping("/editar/{id}")
    public void editarProyecto(@PathVariable Long id, @RequestBody Proyectos pro) {
        pro.setId(id);
        proServ.crearProyecto(pro);
    }

}
