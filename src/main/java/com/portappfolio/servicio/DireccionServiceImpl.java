
package com.portappfolio.servicio;

import com.portappfolio.dao.DireccionDAO;
import com.portappfolio.domain.Direccion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@Slf4j
public class DireccionServiceImpl implements com.portappfolio.servicio.DireccionService {

    @Autowired
    private DireccionDAO direcionDao;
    
    @Override
    public Direccion guardar(Direccion direccion) {
        return direcionDao.save(direccion);
    }
    
}
