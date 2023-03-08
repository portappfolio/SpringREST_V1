package com.portappfolio.servicio;

import com.portappfolio.domain.Ciudad;
import com.portappfolio.domain.Pais;

import java.util.List;


public interface CiudadService {
    public List<Ciudad> listarCiudades();
    
    public Ciudad encontrarCiudad(Ciudad ciudad);
    
    public List<Ciudad> listarCiudadesPorPais(Pais pais);
}
