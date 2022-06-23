package com.proyectofinal.portfolio.proyectos;

import java.util.List;

public interface IProyectosService {

    public List<Proyectos> verProyectos();

    public void crearProyecto(Proyectos pro);

    public void borrarProyecto(Long id);

    public Proyectos buscarProyecto(Long id);

    public void editarProyecto(Long id);

}
