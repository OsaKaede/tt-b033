package com.cacei.version1.entidades;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="RolUsuario")
public class RolUsuario {
    
        @Id
        @Column(name="idRol")
	//@GeneratedValue(strategy = GenerationType.IDENTITY )
        //@OneToMany(fetch = FetchType.EAGER, mappedBy="idRol")
	private String idRol;
        
        @Column(name="Nombre")
	private String Nombre;
        
//        @OneToMany(fetch = FetchType.EAGER, mappedBy = "RolUsuario_idRol")
//        private usuarios RolUsuario;
//        
        
    @OneToMany(
    mappedBy = "RolUsuario",
    cascade = CascadeType.ALL,
    orphanRemoval = true
    )
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<usuarios> usus = new ArrayList<>();

   
        
    public RolUsuario() {}

    public RolUsuario(String idRol, String Nombre) {
        this.idRol = idRol;
        this.Nombre = Nombre;
    }
	
	public String getIdRol() {
		return idRol;
	}

	public void setIdRol(String idRol) {
		this.idRol = idRol;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	 public List<usuarios> getUsus() {
        return usus;
    }

    public void setUsus(List<usuarios> usus) {
        this.usus = usus;
    }
        
        
}
