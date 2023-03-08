
package com.portappfolio.servicio;

import com.portappfolio.dao.ItemFacturaDAO;
import com.portappfolio.domain.ItemFactura;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@Slf4j
public class ItemFacturaServiceImpl implements com.portappfolio.servicio.ItemFacturaService {

    @Autowired
    private ItemFacturaDAO itemFacuturaDao;
    
    @Override
    public ItemFactura guardar(ItemFactura itemFactura) {
        return itemFacuturaDao.save(itemFactura);
    }
    
    
}
