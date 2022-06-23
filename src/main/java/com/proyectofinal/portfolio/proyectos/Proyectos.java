package com.proyectofinal.portfolio.proyectos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre_proyecto;
    private String descripcion;
    private String foto_proyecto;
    private String url_proyecto;
    private Long persona_id;

    public Proyectos() {
    }

    public Proyectos(Long id, String nombre_proyecto, String descripcion, String foto_proyecto, String url_proyecto, Long persona_id) {
        this.id = id;
        this.nombre_proyecto = nombre_proyecto;
        this.descripcion = descripcion;
        this.foto_proyecto = foto_proyecto;
        this.url_proyecto = url_proyecto;
        this.persona_id = persona_id;
    }

}
