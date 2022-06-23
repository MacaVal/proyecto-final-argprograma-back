package com.proyectofinal.portfolio.educacion;

import java.util.List;

public interface IEducacionService {

    public List<Educacion> verEducacion();

    public void crearEstudio(Educacion edu);

    public void borrarEstudio(Long id);

    public Educacion buscarEstudio(Long id);

    public void editarEstudio(Long id);

}
