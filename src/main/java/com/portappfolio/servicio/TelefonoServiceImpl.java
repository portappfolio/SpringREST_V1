
package com.portappfolio.servicio;

import com.portappfolio.dao.TelefonoDAO;
import com.portappfolio.domain.Telefono;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Slf4j
@Transactional
public class TelefonoServiceImpl implements com.portappfolio.servicio.TelefonoService {

    @Autowired
    private TelefonoDAO telefonoDao;
    
    @Override
    public Telefono guardar(Telefono telefono) {
        return telefonoDao.save(telefono);
    }
    
}
