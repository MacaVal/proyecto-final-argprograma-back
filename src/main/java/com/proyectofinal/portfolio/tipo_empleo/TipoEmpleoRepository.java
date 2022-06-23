package com.proyectofinal.portfolio.tipo_empleo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEmpleoRepository extends JpaRepository<TipoEmpleo, Long> {

    public void save(Long id);

}
