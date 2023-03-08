
package com.portappfolio.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "usuario")
@NamedQuery(name = "Usuario.findByEmail",
        query = "select i from Usuario i where LOWER(TRIM(i.username)) = LOWER(TRIM(?1))")
public class Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;
    
    @NotEmpty(message = "Username no puede ser vacio")
    @Column(unique = true)
    private String username;
    
    @NotEmpty(message = "Contraseña no puede ser vacio")
    private String password;
    
    @OneToOne
    @JoinColumn(name = "id_informacion_usuario", referencedColumnName = "id_informacion_usuario")
    private com.portappfolio.domain.InformacionUsuario informacionUsuario;
    
    @OneToMany
    @JoinColumn(name = "id_usuario")
    private List<com.portappfolio.domain.Asignacion> asignaciones;
    
    
}
