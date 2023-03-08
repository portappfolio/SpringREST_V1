
package com.portappfolio.dao;

import com.portappfolio.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FacturaDAO extends JpaRepository<Factura, Long>{
    
}
