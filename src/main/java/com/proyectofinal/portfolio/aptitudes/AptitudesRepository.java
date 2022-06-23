package com.proyectofinal.portfolio.aptitudes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AptitudesRepository extends JpaRepository<Aptitudes, Long> {

    public void save(Long id);

}
