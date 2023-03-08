
package com.portappfolio.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "grupo_empresas")
public class GrupoEmpresa implements Serializable{
    
    private static final Long serialVersioUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grupo_empresa")
    private Integer idGrupoEmpresa;
    
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    @Column(name = "grupo_economico")
    private String grupoEconomico;

    @ManyToOne
    @JoinColumn(name = "id_pais",referencedColumnName = "id_pais")
    private Pais pais;

    private String imagen;
    
    private String descripcion;
    
    @Column(name = "boton_detalles")
    private String botonDetalles;

}
