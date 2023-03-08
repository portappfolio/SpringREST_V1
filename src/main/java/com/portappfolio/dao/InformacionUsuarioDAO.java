
package com.portappfolio.dao;

import com.portappfolio.domain.InformacionUsuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface InformacionUsuarioDAO extends JpaRepository<InformacionUsuario, Long>{
    public InformacionUsuario findByEmail(String email);
}
