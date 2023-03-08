
package com.portappfolio.servicio;

import com.portappfolio.dao.UsuarioDAO;
import com.portappfolio.domain.Usuario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@Slf4j
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioDAO usuarioDao;
    
    @Override
    public Usuario guardar(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Override
    public boolean existe(String email) {
        return (usuarioDao.findByEmail(email) != null);
    }

    @Override
    public Usuario encontrarUsuario(Usuario usuario) {
        return usuarioDao.findById(usuario.getIdUsuario()).orElse(null);
    }
    
}
