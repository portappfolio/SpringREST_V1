
package com.portappfolio.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Entity
@Data
@Table(name = "asignaciones")
public class Asignacion implements Serializable{
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignacion")
    private Long idAsignacion;
    
    @JoinColumn(name = "id_usuario",referencedColumnName = "id_usuario")
    @ManyToOne
    private Usuario usuario;
    
    @JoinColumn(name = "id_empresa",referencedColumnName = "id_empresa")
    @ManyToOne
    private Empresa empresa;
    
    @CreatedDate
    @Column(name = "created_at")
    private Instant createdAt;
    
    @LastModifiedDate
    @Column(name = "updated_at")
    private Instant updatedAt;
    
    @NotNull(message = "Es Administrador no puede ser vacio")
    @Column(name = "is_admin")
    private Boolean isAdmin;
    
    @OneToMany
    @JoinColumn(name = "id_asignacion")
    private List<Factura> facturas;
    
}
