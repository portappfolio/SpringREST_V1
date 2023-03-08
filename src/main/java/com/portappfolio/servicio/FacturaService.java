
package com.portappfolio.servicio;

import com.portappfolio.domain.Factura;


public interface FacturaService {
    public Factura guardar(Factura factura);
    
    public Factura encontrarFactura(Factura factura); //utiliza para encontrar la factura que retorna la pasarela de pagos y actualiza el responsegateway, revisar cómo hacer logs
}
