package com.portappfolio.dao;

import com.portappfolio.domain.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CiudadDAO extends JpaRepository<Ciudad, Integer>{
    public List<Ciudad> findAllByPais(Integer idPais);
}
