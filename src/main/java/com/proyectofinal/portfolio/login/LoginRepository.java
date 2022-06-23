package com.proyectofinal.portfolio.login;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

    public void save(Long id);

    public List<Login> findByMail(String mail);

}
