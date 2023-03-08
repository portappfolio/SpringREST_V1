package com.portappfolio.servicio;

import com.portappfolio.dao.FacturaDAO;
import com.portappfolio.domain.Factura;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@Slf4j
public class FacturaServiceImpl implements com.portappfolio.servicio.FacturaService {

    @Autowired
    private FacturaDAO facturaDao;
    
    @Override
    public Factura guardar(Factura factura) {
        return facturaDao.save(factura);
    }

    @Override
    public Factura encontrarFactura(Factura factura) {
        return facturaDao.findById(factura.getIdFactura()).orElse(null);
    }
    
}
