package com.proyectofinal.portfolio.tipo_empleo;

import java.util.List;

public interface ITipoEmpleoService {

    public List<TipoEmpleo> verTipos();

    public TipoEmpleo buscarTipo(Long id);
    
}
