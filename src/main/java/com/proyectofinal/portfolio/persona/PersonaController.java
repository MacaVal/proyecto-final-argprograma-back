package com.proyectofinal.portfolio.persona;

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
@RequestMapping("/persona")
@CrossOrigin(origins = "*")

public class PersonaController {

    @Autowired
    private IPersonaService persoServ;

    @PostMapping("/nueva")
    public void agregarPersona(@RequestBody Persona pers) {
        persoServ.crearActualizarPersona(pers);
    }

    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable Long id) {
        return persoServ.buscarPersona(id);
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarPersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }

    @PutMapping("/editar/{id}")
    public void editarPersona(@PathVariable Long id, @RequestBody Persona pers) {
        pers.setId(id);
        persoServ.crearActualizarPersona(pers);
    }

}
