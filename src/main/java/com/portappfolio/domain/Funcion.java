
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
@Table(name = "funciones")
@NamedQueries({
        @NamedQuery(name = "Funcion.findAllByGrupoEmpresa", query = "select f from Funcion f where f.grupoEmpresa.idGrupoEmpresa = ?1"),
        @NamedQuery(name = "Funcion.findAllByGrupoEmpresaList", query = "SELECT f from Funcion f where f.grupoEmpresa.idGrupoEmpresa in (?1)")
})

public class Funcion implements Serializable{
    
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcion")
    private Integer idFuncion;

    @JoinColumn(name = "id_grupo_empresas", referencedColumnName = "id_grupo_empresa")
    @ManyToOne
    private com.portappfolio.domain.GrupoEmpresa grupoEmpresa;
    
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    private String descripcion;
    
    @CreatedDate
    @Column(name = "created_at")
    private Instant createdAt;
    
    @LastModifiedDate
    @Column(name = "updated_at")
    private Instant updatedAt;

    
}
