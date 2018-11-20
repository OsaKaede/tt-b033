package com.cacei.version1.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Usuarios")
public class usuarios {
	
        @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="idUsuario")
	private int idUsuario;
	@Column(name="NombreUsuario")
	private String NombreUsuario;
	@Column(name="contrasena")
	private String contrasena;
        
        
       @OneToOne(fetch = FetchType.LAZY, mappedBy = "usuario")
        // @OneToOne(fetch = FetchType.EAGER, mappedBy = "usuario")
        private DatosUsuario DatosUsuario;
        
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name="idRol")
	private RolUsuario RolUsuario;

   
	
	
	public usuarios() {}
	
	public usuarios(int idUsuario, String nombreUsuario, String password, RolUsuario rolUsuario_idRol) {
		this.idUsuario = idUsuario;
		this.NombreUsuario = nombreUsuario;
		this.contrasena = password;
		this.RolUsuario = rolUsuario_idRol;
	}
	
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombreUsuario() {
		return NombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		NombreUsuario = nombreUsuario;
	}
	public String getPassword() {
		return contrasena;
	}
	public void setPassword(String password) {
		contrasena = password;
	}
	public RolUsuario getRolUsuario_idRol() {
		return RolUsuario;
	}
	public void setRolUsuario_idRol(RolUsuario rolUsuario_idRol) {
		RolUsuario = rolUsuario_idRol;
        }
         public DatosUsuario getDatosUsuario() {
        return DatosUsuario;
    }

    public void setDatosUsuario(DatosUsuario DatosUsuario) {
        this.DatosUsuario = DatosUsuario;
    }
	
	
	

}
	