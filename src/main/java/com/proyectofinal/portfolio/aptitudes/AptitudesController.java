package com.proyectofinal.portfolio.aptitudes;

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
@RequestMapping("/aptitudes")
@CrossOrigin(origins = "*")

public class AptitudesController {

    @Autowired
    private IAptitudesService aptiServ;

    @PostMapping("/nueva")
    public void agregarAptitud(@RequestBody Aptitudes apti) {
        aptiServ.crearAptitud(apti);
    }

    @GetMapping("buscar/{id}")
    @ResponseBody
    public Aptitudes buscarAptitud(@PathVariable Long id) {
        return aptiServ.buscarAptitud(id);
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Aptitudes> verAptitudes() {
        return aptiServ.verAptitudes();
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarAptitud(@PathVariable Long id) {
        aptiServ.borrarAptitud(id);
    }

    @PutMapping("/editar/{id}")
    public void editarAptitud(@PathVariable Long id, @RequestBody Aptitudes apti) {
        apti.setId(id);
        aptiServ.crearAptitud(apti);
    }

}
