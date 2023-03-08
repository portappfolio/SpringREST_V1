
package com.portappfolio.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;


@Data
@Entity
@Table(name = "ciudades")
@NamedQuery(name = "Ciudad.findAllByPais",
        query = "select c from Ciudad c where c.pais.idPais = ?1")
public class Ciudad implements Serializable{
    
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ciudad")
    private Integer idCiudad;
    
    @JoinColumn(name = "id_pais",referencedColumnName = "id_pais")
    @ManyToOne
    private Pais pais;
    
    @NotNull
    private Double latitud;
    
    @NotNull
    private Double longitud;
    
    @NotEmpty
    private String nombre;
    
    @OneToMany
    @JoinColumn(name = "id_ciudad")
    List<CodigoPostal> codigosPostales;
    
}
