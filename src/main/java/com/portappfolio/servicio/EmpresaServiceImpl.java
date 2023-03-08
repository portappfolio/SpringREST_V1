
package com.portappfolio.servicio;

import com.portappfolio.dao.EmpresaDAO;
import com.portappfolio.domain.Empresa;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@Slf4j
public class EmpresaServiceImpl implements com.portappfolio.servicio.EmpresaService {

    @Autowired
    private EmpresaDAO empresaDao;
    
    @Override
    public Empresa guardar(Empresa empresa) {
        return empresaDao.save(empresa);
    }

    @Override
    public boolean existe(String identificacion) {
        return (empresaDao.findByIdentificacion(identificacion) != null);
    }
    
}
