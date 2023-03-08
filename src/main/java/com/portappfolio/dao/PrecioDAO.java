
package com.portappfolio.dao;

import com.portappfolio.domain.Precio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PrecioDAO extends JpaRepository<Precio, Integer>{
    Precio FindPrecioByFuncionAndPeriodo(Integer idFuncion,Integer periodo);
    List<Precio> FindPreciosByFuncion(Integer idFuncion);
    List<Precio> FindPreciosByFunciones(List<Integer> idFunciones);
}
