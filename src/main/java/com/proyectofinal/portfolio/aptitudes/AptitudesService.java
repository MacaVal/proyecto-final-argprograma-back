package com.proyectofinal.portfolio.aptitudes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AptitudesService implements IAptitudesService {

    @Autowired
    public AptitudesRepository aptiRepo;

    @Override
    public List<Aptitudes> verAptitudes() {
        return aptiRepo.findAll();
    }

    @Override
    public void crearAptitud(Aptitudes apti) {
        aptiRepo.save(apti);
    }

    @Override
    public void borrarAptitud(Long id) {
        aptiRepo.deleteById(id);
    }

    @Override
    public Aptitudes buscarAptitud(Long id) {
        return aptiRepo.findById(id).orElse(null);
    }

    @Override
    public void editarAptitud(Long id) {
        aptiRepo.save(id);
    }

}
