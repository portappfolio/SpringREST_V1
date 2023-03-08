
package com.portappfolio.dao;

import com.portappfolio.domain.CodigoPostal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CodigoPostalDAO extends JpaRepository<CodigoPostal, Integer>{
    public List<CodigoPostal> findAllByCiudad(Integer idCiudad);
}
