
package com.portappfolio.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Data
@Entity
@Table(name = "facturas")
public class Factura implements Serializable{
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Long idFactura;
    
    @CreatedDate
    @Column(name = "created_at")
    private Instant createdAt;
    
    @LastModifiedDate
    @Column(name = "updated_at")
    private Instant updatedAt;
    
    @Column(name = "end_at")
    private Instant endAt;
    
    @Column(name = "reminder_since")
    private Instant reminderSince;
    
    
    @Column(name = "response_getway")
    private String responseGetway;
    
    @NotNull(message = "Periodo no puede ser vacio")
    private Integer periodo;
    
    @NotNull(message = "Valor no puede ser vacio")
    private Integer valor;
    
    @NotNull(message = "Cantidad de Items no puede ser vacio")
    @Column(name = "cant_items")
    private Integer cantItems;
    
    @ManyToOne
    @JoinColumn(name = "id_asignacion",referencedColumnName = "id_asignacion")
    private com.portappfolio.domain.Asignacion asignacion;
    
    @OneToMany
    @JoinColumn(name = "id_factura")
    private List<ItemFactura> itemsFactura;
    
}
