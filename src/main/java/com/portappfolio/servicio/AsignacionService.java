
package com.portappfolio.servicio;

import com.portappfolio.domain.Asignacion;


public interface AsignacionService {
    public Asignacion guardar(Asignacion asignacion);
    
    public Asignacion encontrarAsignacion(Asignacion asignacion);
}
