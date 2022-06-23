package com.proyectofinal.portfolio.educacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {

    @Autowired
    public EducacionRepository eduRepo;

    @Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEstudio(Educacion exp) {
        eduRepo.save(exp);
    }

    @Override
    public void borrarEstudio(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEstudio(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public void editarEstudio(Long id) {
        eduRepo.save(id);
    }

}
