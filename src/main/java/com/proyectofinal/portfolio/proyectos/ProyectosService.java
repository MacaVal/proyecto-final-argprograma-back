package com.proyectofinal.portfolio.proyectos;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {

    @Autowired
    public ProyectosRepository proRepo;

    @Override
    public List<Proyectos> verProyectos() {
        return proRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyectos pro) {
        proRepo.save(pro);
    }

    @Override
    public void borrarProyecto(Long id) {
        proRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyecto(Long id) {
        return proRepo.findById(id).orElse(null);
    }

    @Override
    public void editarProyecto(Long id) {
        proRepo.save(id);
    }

}
