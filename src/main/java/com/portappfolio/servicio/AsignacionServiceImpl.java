
package com.portappfolio.servicio;

import com.portappfolio.dao.AsignacionDAO;
import com.portappfolio.domain.Asignacion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Slf4j
@Transactional
public class AsignacionServiceImpl implements com.portappfolio.servicio.AsignacionService {

    @Autowired
    private AsignacionDAO asignacionDao;
    
    @Override
    public Asignacion guardar(Asignacion asignacion) {
        return asignacionDao.save(asignacion);
    }

    @Override
    public Asignacion encontrarAsignacion(Asignacion asignacion) {
        return asignacionDao.findById(asignacion.getIdAsignacion()).orElse(null);
    }
    
}
