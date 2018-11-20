/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.auxiliares;

/**
 *
 * @author PC
 */
public class AuxAdminRegis {
    
    public String IdUsuario;
    public String Nombre;
    public String ApelldioPaterno;
    public String ApellidoMaterno;
    public String Email;
    public String Telefono;
    public String NombreRol;
    public String NombreUsuario;
    public String contrasena;

    public AuxAdminRegis(){}
    
    public AuxAdminRegis(String IdUsuario,String Nombre, String ApelldioPaterno, String ApellidoMaterno, String Email, String Telefono, String NombreRol, String NombreUsuario, String contrasena) {
        this.IdUsuario=IdUsuario;
        this.Nombre = Nombre;
        this.ApelldioPaterno = ApelldioPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Email = Email;
        this.Telefono = Telefono;
        this.NombreRol = NombreRol;
        this.NombreUsuario = NombreUsuario;
        this.contrasena = contrasena;
    }

    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String IdUsuario) {
        this.IdUsuario = IdUsuario;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApelldioPaterno() {
        return ApelldioPaterno;
    }

    public void setApelldioPaterno(String ApelldioPaterno) {
        this.ApelldioPaterno = ApelldioPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getNombreRol() {
        return NombreRol;
    }

    public void setNombreRol(String NombreRol) {
        this.NombreRol = NombreRol;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
}
