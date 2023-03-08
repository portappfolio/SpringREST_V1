package com.portappfolio.servicio;

import com.portappfolio.dao.GrupoEmpresaDAO;
import com.portappfolio.domain.GrupoEmpresa;
import com.portappfolio.domain.Pais;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class GrupoEmpresaServiceImpl implements com.portappfolio.servicio.GrupoEmpresaService {

    @Autowired
    private GrupoEmpresaDAO grupoEmpresaDao;
    
    @Override
    
    public List<GrupoEmpresa> listarGruposEmpresas() {
        return grupoEmpresaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public GrupoEmpresa encontrarGrupoEmpresa(GrupoEmpresa grupoEmpresa) {
        return grupoEmpresaDao.findById(grupoEmpresa.getIdGrupoEmpresa()).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<GrupoEmpresa> listarGruposEmpresasPorPais(Pais pais) {
        return grupoEmpresaDao.findAllByPais(pais.getIdPais());
    }
    
}
