
package com.portappfolio.servicio;

import com.portappfolio.domain.Empresa;


public interface EmpresaService {
    public Empresa guardar(Empresa empresa);
    
    public boolean existe(String identificacion);
}
