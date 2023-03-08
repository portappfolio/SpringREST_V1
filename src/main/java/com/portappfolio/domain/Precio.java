
package com.portappfolio.domain;

import jdk.jfr.Name;
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
@Table(name = "precios")
@NamedQueries({
        @NamedQuery(name = "Precio.FindPrecioByFuncionAndPeriodo",query = "select p from Precio p where p.funcion.idFuncion = ?1 and p.periodo = ?2"),
        @NamedQuery(name = "Precio.FindPreciosByFuncion", query = "select p from Precio p where p.funcion.idFuncion = ?1"),
        @NamedQuery(name = "Precio.FindPreciosByFunciones", query = "SELECT p from Precio p where p.funcion.idFuncion in (?1)")
})
public class Precio implements Serializable{
    private static final Long SerialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_precio")
    private Integer idPrecio;

    @JoinColumn(name = "id_funcion",referencedColumnName = "id_funcion")
    @ManyToOne
    private com.portappfolio.domain.Funcion funcion;
    
    @NotNull
    private Integer periodo;
    
    @NotNull
    private Integer precio;
    
    @CreatedDate
    @Column(name = "created_at")
    private Instant createdAt;
    
    @LastModifiedDate
    @Column(name = "updated_at")
    private Instant updatedAt;

    
}
