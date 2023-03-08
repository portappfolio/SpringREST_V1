package com.portappfolio.dao;

import com.portappfolio.domain.GrupoEmpresa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GrupoEmpresaDAO extends JpaRepository<GrupoEmpresa, Integer>{
    List<GrupoEmpresa> findAllByPais(Integer idPais);
}
