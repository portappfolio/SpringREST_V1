
package com.portappfolio.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "items_facturas")
public class ItemFactura implements Serializable{
    
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_item_factura")
    private Long idItemFactura;
    
    @ManyToOne
    @JoinColumn(name = "id_factura",referencedColumnName = "id_factura")
    private com.portappfolio.domain.Factura factura;
    
    @ManyToOne
    @JoinColumn(name = "id_precio",referencedColumnName = "id_precio")
    private com.portappfolio.domain.Precio precio;
    
}
