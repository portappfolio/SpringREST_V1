
package com.portappfolio.servicio;

import com.portappfolio.dao.InformacionUsuarioDAO;
import com.portappfolio.domain.InformacionUsuario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Slf4j
@Transactional
public class InformacionUsuarioServiceImpl implements com.portappfolio.servicio.InformacionUsuarioService {

    @Autowired
    private InformacionUsuarioDAO informacionUsuarioDao;
    
    @Override
    public InformacionUsuario guardar(InformacionUsuario informacionUsuario) {
        return informacionUsuarioDao.save(informacionUsuario);
    }

    @Override
    public boolean existe(String email) {
        return (informacionUsuarioDao.findByEmail(email) != null);
    }
    
}
