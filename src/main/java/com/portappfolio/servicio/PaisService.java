
package com.portappfolio.servicio;

import com.portappfolio.domain.Pais;

import java.util.List;


public interface PaisService {
    public List<Pais> listarPaises();
    
    public Pais encontrarPais(Pais pais);
    
    public Pais encontrarPaisPorID(Integer id);
}
