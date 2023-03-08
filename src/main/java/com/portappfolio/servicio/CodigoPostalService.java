package com.portappfolio.servicio;

import com.portappfolio.domain.Ciudad;
import com.portappfolio.domain.CodigoPostal;

import java.util.List;

public interface CodigoPostalService {
    public List<CodigoPostal> listarCodigosPostales();
    
    public CodigoPostal encontrarCodigoPostal(CodigoPostal codigoPostal);
    
    public List<CodigoPostal> listarCodigosPostalesPorCiudad(Ciudad ciudad);
}
