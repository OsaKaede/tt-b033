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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name="DatosLaboratorio")
public class DatosLaboratorio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDatosLaboratorio")
    private int idDatosLaboratorio;
    @Column(name="nombreLab")
    private String nombreLab;
    
    @OneToMany(
    mappedBy = "DatosLaboratorio",
    cascade = CascadeType.ALL,
    orphanRemoval = true
    )
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Cedula512> Cedula512 = new ArrayList<>();
    
    public DatosLaboratorio(){}

    public DatosLaboratorio(int idDatosLaboratorio, String nombreLab) {
        this.idDatosLaboratorio = idDatosLaboratorio;
        this.nombreLab = nombreLab;
    }

    public List<Cedula512> getCedula512() {
        return Cedula512;
    }

    public void setCedula512(List<Cedula512> Cedula512) {
        this.Cedula512 = Cedula512;
    }
    public String getNombreLab() {
        return nombreLab;
    }

    public void setNombreLab(String nombreLab) {
        this.nombreLab = nombreLab;
    }

     public int getIdDatosLaboratorio() {
        return idDatosLaboratorio;
    }

    public void setIdDatosLaboratorio(int idDatosLaboratorio) {
        this.idDatosLaboratorio = idDatosLaboratorio;
    }
    
}
