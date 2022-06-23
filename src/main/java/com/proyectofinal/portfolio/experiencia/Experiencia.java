package com.proyectofinal.portfolio.experiencia;

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
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String cargo;
    private String nombre_empresa;
    private Boolean es_actual;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String descripcion;
    private String foto_experiencia;
    private Long persona_id;
    private Long tipo_empleo_id;

    public Experiencia() {
    }

    public Experiencia(Long id, String nombre_empresa, Boolean es_actual, Date fecha_inicio, Date fecha_fin, String descripcion, String foto_experiencia, Long persona_id, Long tipo_empleo_id) {
        this.id = id;
        this.nombre_empresa = nombre_empresa;
        this.es_actual = es_actual;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.foto_experiencia = foto_experiencia;
        this.persona_id = persona_id;
        this.tipo_empleo_id = tipo_empleo_id;
    }

}
