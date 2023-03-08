
package com.portappfolio.servicio;

import com.portappfolio.domain.InformacionUsuario;


public interface InformacionUsuarioService {
    public InformacionUsuario guardar(InformacionUsuario informacionUsuario);
    
    public boolean existe(String email);
}
