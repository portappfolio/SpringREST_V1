package com.portappfolio.dao;

import com.portappfolio.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioDAO extends JpaRepository<Usuario,Long>{
    public Usuario findByEmail(String email);
}