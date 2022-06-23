package com.proyectofinal.portfolio.aptitudes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Aptitudes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre_aptitud;
    private Long porcentaje;
    private Long persona_id;

    public Aptitudes() {
    }

    public Aptitudes(Long id, String nombre_aptitud, Long porcentaje, Long persona_id) {
        this.id = id;
        this.nombre_aptitud = nombre_aptitud;
        this.porcentaje = porcentaje;
        this.persona_id = persona_id;
    }

}
