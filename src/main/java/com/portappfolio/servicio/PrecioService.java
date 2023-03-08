
package com.portappfolio.servicio;

import com.portappfolio.domain.Funcion;
import com.portappfolio.domain.Precio;

import java.util.List;


public interface PrecioService {
    public List<Precio> listarPrecios();
    
    public Precio encontrarPrecio(Precio precio);
    
    public Precio encontrarPorFuncionYPeriodo(Funcion funcion, Integer periodo);

    public List<Precio> encontrarPreciosPorFuncion(Funcion funcion);

    public List<Precio> encontrarPreciosPorFunciones(List<Funcion> funciones);
}
