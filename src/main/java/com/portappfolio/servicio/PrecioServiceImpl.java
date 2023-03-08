/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portappfolio.servicio;

import com.portappfolio.dao.PrecioDAO;
import com.portappfolio.domain.Funcion;
import com.portappfolio.domain.GrupoEmpresa;
import com.portappfolio.domain.Precio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class PrecioServiceImpl implements PrecioService{
    
    @Autowired
    private PrecioDAO precioDao;

    @Override
    public List<Precio> listarPrecios() {
        return precioDao.findAll();
    }

    @Override
    public Precio encontrarPrecio(Precio precio) {
        return precioDao.findById(precio.getIdPrecio()).orElse(null);
    }

    @Override
    public Precio encontrarPorFuncionYPeriodo(Funcion funcion, Integer periodo) {
        return precioDao.FindPrecioByFuncionAndPeriodo(funcion.getIdFuncion(), periodo);
    }

    @Override
    public List<Precio> encontrarPreciosPorFuncion(Funcion funcion) {
        return precioDao.FindPreciosByFuncion(funcion.getIdFuncion());
    }

    @Override
    public List<Precio> encontrarPreciosPorFunciones(List<Funcion> funciones) {
        List<Integer> ids = new ArrayList<>();
        for (Funcion f : funciones){
            ids.add(f.getIdFuncion());
        }
        return precioDao.FindPreciosByFunciones(ids);
    }

    
}
