
package com.portappfolio.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.Instant;

@Data
@Entity
@Table(name = "direcciones")
public class Direccion implements Serializable{
    
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direccion")
    private Long idDirecion;
    
    @JoinColumn(name = "id_codigo_postal",referencedColumnName = "id_codigo_postal")
    @ManyToOne
    private com.portappfolio.domain.CodigoPostal codigoPostal;
    
    @NotEmpty(message = "Direccion no puede ser vacio")
    private String direccion;
    
    @CreatedDate
    @Column(name = "created_at")
    private Instant createdAt;
    
    @LastModifiedDate
    @Column(name = "updated_at")
    private Instant updatedAt;
}
