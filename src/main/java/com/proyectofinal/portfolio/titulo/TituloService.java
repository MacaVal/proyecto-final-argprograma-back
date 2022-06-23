package com.proyectofinal.portfolio.titulo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TituloService implements ITituloService {

    @Autowired
    public TituloRepository tituloRepo;

    @Override
    public List<Titulo> verTitulos() {
        return tituloRepo.findAll();
    }

    @Override
    public Titulo buscarTitulo(Long id) {
        return tituloRepo.findById(id).orElse(null);
    }

}
