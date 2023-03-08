
package com.portappfolio.servicio;

import com.portappfolio.domain.GrupoEmpresa;
import com.portappfolio.domain.Pais;

import java.util.List;

public interface GrupoEmpresaService {
    public List<GrupoEmpresa> listarGruposEmpresas();
    
    public GrupoEmpresa encontrarGrupoEmpresa(GrupoEmpresa grupoEmpresa);
    
    public List<GrupoEmpresa> listarGruposEmpresasPorPais(Pais pais);
}
