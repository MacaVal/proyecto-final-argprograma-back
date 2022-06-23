package com.proyectofinal.portfolio.educacion;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre_instituto;
    private Boolean en_curso;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String descripcion;
    private String foto_educacion;
    private Long persona_id;
    private Long titulo_id;

    public Educacion() {
    }

    public Educacion(Long id, String nombre_instituto, Boolean en_curso, Date fecha_inicio, Date fecha_fin, String descripcion, String foto_educacion, Long persona_id, Long titulo_id) {
        this.id = id;
        this.nombre_instituto = nombre_instituto;
        this.en_curso = en_curso;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.foto_educacion = foto_educacion;
        this.persona_id = persona_id;
        this.titulo_id = titulo_id;
    }

}
