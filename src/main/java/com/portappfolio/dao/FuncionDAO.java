package com.portappfolio.dao;

import com.portappfolio.domain.Funcion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface FuncionDAO extends JpaRepository<Funcion, Integer>{
    List<Funcion> findAllByGrupoEmpresa(Integer idGrupoEmpresa);
    List<Funcion> findAllByGrupoEmpresaList(List<Integer> listIdGrupoEmpresa);
}