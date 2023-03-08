
package com.portappfolio.servicio;

import com.portappfolio.dao.CodigoPostalDAO;
import com.portappfolio.domain.Ciudad;
import com.portappfolio.domain.CodigoPostal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class CodigoPostalServiceImpl implements CodigoPostalService{

    @Autowired
    CodigoPostalDAO codigoPostalDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<CodigoPostal> listarCodigosPostales() {
        return codigoPostalDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public CodigoPostal encontrarCodigoPostal(CodigoPostal codigoPostal) {
        return codigoPostalDao.findById(codigoPostal.getIdCodigoPostal()).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<CodigoPostal> listarCodigosPostalesPorCiudad(Ciudad ciudad) {
        return codigoPostalDao.findAllByCiudad(ciudad.getIdCiudad());
    }
    
}
