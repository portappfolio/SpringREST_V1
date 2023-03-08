
package com.portappfolio.servicio;

import com.portappfolio.dao.FuncionDAO;
import com.portappfolio.domain.Funcion;
import com.portappfolio.domain.GrupoEmpresa;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class FuncionServiceImpl implements com.portappfolio.servicio.FuncionService {

    @Autowired
    private FuncionDAO funcionDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Funcion> listarFunciones() {
        return funcionDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Funcion encontrarFuncion(Funcion funcion) {
        return funcionDao.findById(funcion.getIdFuncion()).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Funcion> listarFuncionesPorGrupoEmpresa(GrupoEmpresa grupoEmpresa) {
        return funcionDao.findAllByGrupoEmpresa(grupoEmpresa.getIdGrupoEmpresa());
    }

    @Override
    public List<Funcion> listarFuncionesPorGruposEmpresas(List<GrupoEmpresa> gruposEmpresas) {
        List<Integer> ids = new ArrayList<>();
        for (GrupoEmpresa g : gruposEmpresas){
            ids.add(g.getIdGrupoEmpresa());
        }
        return funcionDao.findAllByGrupoEmpresaList(ids);
    }

}
