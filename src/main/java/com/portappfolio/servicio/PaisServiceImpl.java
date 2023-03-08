
package com.portappfolio.servicio;

import com.portappfolio.dao.PaisDAO;
import com.portappfolio.domain.Pais;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class PaisServiceImpl implements PaisService{
    
    @Autowired
    private PaisDAO paisDao;

    @Override
    @Transactional(readOnly = true)
    public List<Pais> listarPaises() {
        return paisDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Pais encontrarPais(Pais pais) {
        return paisDao.findById(pais.getIdPais()).orElse(null);
    }

    @Override
    public Pais encontrarPaisPorID(Integer id) {
        return paisDao.findById(id).orElse(null);
    }
    
    
}
