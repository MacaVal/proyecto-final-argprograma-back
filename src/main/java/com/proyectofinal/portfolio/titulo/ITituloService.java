package com.proyectofinal.portfolio.titulo;

import java.util.List;

public interface ITituloService {

    public List<Titulo> verTitulos();

    public Titulo buscarTitulo(Long id);
    
}
