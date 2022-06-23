package com.proyectofinal.portfolio.persona;

import java.util.List;

public interface IPersonaService {

    public List<Persona> verPersonas();

    public void crearActualizarPersona(Persona per);

    public void borrarPersona(Long id);

    public Persona buscarPersona(Long id);

    public void editarPersona(Long id);
    
}
