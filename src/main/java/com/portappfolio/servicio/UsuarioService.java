
package com.portappfolio.servicio;

import com.portappfolio.domain.Usuario;


public interface UsuarioService {
    public Usuario guardar(Usuario usuario);
    
    public boolean existe(String email);
    
    public Usuario encontrarUsuario(Usuario usuario);
}
