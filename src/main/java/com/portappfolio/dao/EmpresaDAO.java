
package com.portappfolio.dao;

import com.portappfolio.domain.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpresaDAO extends JpaRepository<Empresa, Long> {
    public Empresa findByIdentificacion(String identificacion);
}
