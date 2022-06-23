package com.proyectofinal.portfolio.tipo_empleo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TipoEmpleo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre_tipo;

    public TipoEmpleo() {
    }

    public TipoEmpleo(Long id, String nombre_tipo) {
        this.id = id;
        this.nombre_tipo = nombre_tipo;
    }

}
