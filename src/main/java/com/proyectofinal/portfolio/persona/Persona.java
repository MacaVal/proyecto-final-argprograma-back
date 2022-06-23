package com.proyectofinal.portfolio.persona;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String acerca_de_mi;
    private String url_foto;
    private String url_banner;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String titulo, String acerca_de_mi, String url_foto, String url_banner) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.acerca_de_mi = acerca_de_mi;
        this.url_foto = url_foto;
        this.url_banner = url_banner;
    }

}
