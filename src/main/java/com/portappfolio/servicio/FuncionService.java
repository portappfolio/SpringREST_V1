
package com.portappfolio.servicio;

import com.portappfolio.domain.Funcion;
import com.portappfolio.domain.GrupoEmpresa;

import java.util.List;


public interface FuncionService {
    public List<Funcion> listarFunciones();
    
    public List<Funcion> listarFuncionesPorGrupoEmpresa(GrupoEmpresa grupoEmpresa);

    public List<Funcion> listarFuncionesPorGruposEmpresas(List<GrupoEmpresa> gruposEmpresas);

    public Funcion encontrarFuncion(Funcion funcion);
}
