package com.cacei.version1.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "DatosUsuario")
public class DatosUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idDatosUsuario")
    private int idDatosUsuario;
    @Column(name = "Nombre")
    private String Nombre;
    @Column(name = "ApelldioPaterno")
    private String ApelldioPaterno;
    @Column(name = "ApellidoMaterno")
    private String ApellidoMaterno;
    @Column(name = "Email")
    private String Email;
    @Column(name = "Telefono")
    private String Telefono;
    
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval = true )
    //@OneToOne(fetch = FetchType.EAGER )
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id", nullable = false)
    private usuarios usuario;

    public DatosUsuario() {
    }

    public DatosUsuario(int idDatosUsuario, String Nombre, String ApelldioPaterno, String ApellidoMaterno, String Email, String Telefono, usuarios usuario) {
        this.idDatosUsuario = idDatosUsuario;
        this.Nombre = Nombre;
        this.ApelldioPaterno = ApelldioPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Email = Email;
        this.Telefono = Telefono;
        this.usuario = usuario;
    }

    public DatosUsuario(String Nombre, String ApelldioPaterno, String ApellidoMaterno, String Email, String Telefono, usuarios usuario) {
        this.Nombre = Nombre;
        this.ApelldioPaterno = ApelldioPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Email = Email;
        this.Telefono = Telefono;
        this.usuario = usuario;
    }

    public usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(usuarios usuario) {
        this.usuario = usuario;
    }

    public int getIdDatosUsuario() {
        return idDatosUsuario;
    }

    public void setIdDatosUsuario(int idDatosUsuario) {
        this.idDatosUsuario = idDatosUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApelldioPaterno() {
        return ApelldioPaterno;
    }

    public void setApelldioPaterno(String apelldioPaterno) {
        ApelldioPaterno = apelldioPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        ApellidoMaterno = apellidoMaterno;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

}
