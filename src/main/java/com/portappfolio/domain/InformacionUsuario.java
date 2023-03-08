
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
@Table(name = "informacion_usuarios")
@NamedQuery(name = "InformacionUsuario.findByEmail",
        query = "select i from InformacionUsuario i where LOWER(TRIM(i.email)) = LOWER(TRIM(?1))")
public class InformacionUsuario implements Serializable{
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_informacion_usuario")
    private Long idInformacionUsuario;
    
    @JoinColumn(name = "id_telefono",referencedColumnName = "id_telefono")
    @OneToOne
    private Telefono telefono;
    
    @JoinColumn(name = "id_ciudad",referencedColumnName = "id_ciudad")
    @ManyToOne
    private com.portappfolio.domain.Ciudad ciudad;
    
    @NotEmpty(message = "Email no puede ser vacio")
    @Column(unique = true)
    private String email;
    
    @NotEmpty(message = "Nombre no puede ser vacio")
    private String nombre;
    
    @Lob
    private byte[] foto;
    
    @CreatedDate
    @Column(name = "created_at")
    private Instant createdAt;
    
    @LastModifiedDate
    @Column(name = "updated_at")
    private Instant updatedAt;
    
}
