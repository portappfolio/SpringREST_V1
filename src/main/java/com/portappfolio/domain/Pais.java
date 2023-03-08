
package com.portappfolio.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "paises")
public class Pais implements Serializable{
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pais")
    private Integer idPais;
    
    @NotEmpty
    private String nombre;
    
    @NotNull
    @Column(name = "indicativo_telefono")
    private Integer indicativoTelefono;
    
    @NotEmpty
    private String moneda;

    @Column(name = "foto_bandera")
    private String fotoBandera;
            
    @NotNull
    private Double latitud;
    
    @NotNull
    private Double longitud;
    
    @Column(name = "num_digitos_telefono")
    @NotNull
    private Integer numDigitosTelefono;
    
    @Column(name = "tipo_identificacion_empresa")
    private String tipoIdentificacionEmpresa;

    
            
}
