/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.entidades;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 *
 * @author ilsem
 */
@Entity
@Table (name="Cedula")
public class Cedula {
    @Id
    @Column(name="idCedula")
    private int idCedula;
    
    @Column(name="nombre_ced")
    private String nombreCedula;
    
    @Column(name="RutaCedula")
    private String RutaCedula;
    
    @OneToMany(
    mappedBy = "Cedula",
    cascade = CascadeType.ALL,
    orphanRemoval = true
    )
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Cedula512> cedu512 = new ArrayList<>();
    
    public Cedula(){}
    
     public Cedula(int idCedula, String nombreCedula, String RutaCedula) {
        this.idCedula = idCedula;
        this.nombreCedula = nombreCedula;
        this.RutaCedula = RutaCedula;
    }
    
    public List<Cedula512> getCedu512() {
        return cedu512;
    }

    public void setCedu512(List<Cedula512> cedu512) {
        this.cedu512 = cedu512;
    }

        
    public int getIdCedula() {
        return idCedula;
    }

    public void setIdCedula(int idCedula) {
        this.idCedula = idCedula;
    }

    public String getNombreCedula() {
        return nombreCedula;
    }

    public void setNombreCedula(String nombreCedula) {
        this.nombreCedula = nombreCedula;
    }

    public String getRutaCedula() {
        return RutaCedula;
    }

    public void setRutaCedula(String RutaCedula) {
        this.RutaCedula = RutaCedula;
    }

   
    
}
