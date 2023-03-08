
package com.portappfolio.servicio;

import com.portappfolio.dao.CiudadDAO;
import com.portappfolio.domain.Ciudad;
import com.portappfolio.domain.Pais;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class CiudadServiceImpl implements com.portappfolio.servicio.CiudadService {

    @Autowired
    private CiudadDAO ciudadDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Ciudad> listarCiudades() {
        return ciudadDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Ciudad encontrarCiudad(Ciudad ciudad) {
        return ciudadDao.findById(ciudad.getIdCiudad()).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Ciudad> listarCiudadesPorPais(Pais pais) {
        return ciudadDao.findAllByPais(pais.getIdPais());
    }
    
}
