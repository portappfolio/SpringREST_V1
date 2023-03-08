
package com.portappfolio.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
@Table(name = "codigos_postales")
@NamedQuery(name = "CodigoPostal.findAllByCiudad",
        query = "select c from CodigoPostal c where c.ciudad.idCiudad = ?1 order by c.nombreBarrio asc")
public class CodigoPostal implements Serializable{
    
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_codigo_postal")
    private Integer idCodigoPostal;
    
    @JoinColumn(name = "id_ciudad",referencedColumnName = "id_ciudad")
    @ManyToOne
    private com.portappfolio.domain.Ciudad ciudad;
    
    @NotEmpty
    private String codigo;
    
    @NotEmpty
    @Column(name = "nombre_barrio")
    private String nombreBarrio;
    
    @NotNull
    private Double latitud;
    
    @NotNull
    private Double longitud;
}
