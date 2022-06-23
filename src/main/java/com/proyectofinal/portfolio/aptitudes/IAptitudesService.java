package com.proyectofinal.portfolio.aptitudes;

import java.util.List;

public interface IAptitudesService {

    public List<Aptitudes> verAptitudes();

    public void crearAptitud(Aptitudes apti);

    public void borrarAptitud(Long id);

    public Aptitudes buscarAptitud(Long id);

    public void editarAptitud(Long id);

}
