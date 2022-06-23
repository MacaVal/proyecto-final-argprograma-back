package com.proyectofinal.portfolio.tipo_empleo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoEmpleoService implements ITipoEmpleoService {

    @Autowired
    public TipoEmpleoRepository empleoRepo;

    @Override
    public List<TipoEmpleo> verTipos() {
        return empleoRepo.findAll();
    }

    @Override
    public TipoEmpleo buscarTipo(Long id) {
        return empleoRepo.findById(id).orElse(null);
    }

}
