package com.proyectofinal.portfolio.titulo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Titulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre_titulo;

    public Titulo() {
    }

    public Titulo(Long id, String nombre_titulo) {
        this.id = id;
        this.nombre_titulo = nombre_titulo;
    }

}
