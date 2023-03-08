
package com.portappfolio.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Data
@Entity
@Table(name = "empresas")
@NamedQuery(name = "Empresa.findByIdentificacion",
        query = "select e from Empresa e where LOWER(TRIM(e.identificacion)) = LOWER(TRIM(?1))")
public class Empresa implements Serializable{
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private Long idEmpresa;
    
    @OneToOne
    @JoinColumn(name = "id_direccion",referencedColumnName = "id_direccion")
    private Direccion direccion;
    
    @NotEmpty(message = "Identificacion no puede ser vacio")
    @Column(unique = true)
    private String identificacion;
    
    @NotEmpty(message = "Nombre Empresa no puede ser vacio")
    private String nombre;
    
    @Lob
    private byte[] foto;
    
    @CreatedDate
    @Column(name = "created_at")
    private Instant createdAt;
    
    @LastModifiedDate
    @Column(name = "updated_at")
    private Instant updatedAt;
    
    
    @Column(name = "has_free_trial")
    private Boolean hasFreeTrial;
    
    @Column(name = "imagen_base64")
    private String imagenBase64;
    
    @OneToMany
    @JoinColumn(name = "id_empresa")
    private List<com.portappfolio.domain.Asignacion> asignaciones;
    
    
}
