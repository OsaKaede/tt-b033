/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ilsem
 */
@Entity
@Table (name="Cedula512")
public class Cedula512 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCedula512")
    private int idCedula512;
    
    @Column(name="numEquipo")
    private int numEquipo;
    
    @Column(name="nombreEquipo")
    private String nombreEquipo;
    
    @Column(name="cantidad")
    private int cantidad;
    
    
 
    
    //Mapeo hacia Datos Laboratorio
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idDatosLaboratorio")
    private DatosLaboratorio DatosLaboratorio;
    
    //Mapeo hacia la Cedula
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idCedula")
    private Cedula Cedula;

    public Cedula512(){}
    
    
    
    public Cedula512(int idCedula512, int numEquipo, String nombreEquipo, int cantidad, DatosLaboratorio DatosLaboratorio, Cedula Cedula) {
        this.idCedula512 = idCedula512;
        this.numEquipo = numEquipo;
        this.nombreEquipo = nombreEquipo;
        this.cantidad = cantidad;
        this.DatosLaboratorio = DatosLaboratorio;
        this.Cedula = Cedula;
    }
    
    
    

    public DatosLaboratorio getDatosLaboratorio() {
        return DatosLaboratorio;
    }

    public void setDatosLaboratorio(DatosLaboratorio DatosLaboratorio) {
        this.DatosLaboratorio = DatosLaboratorio;
    }

    public Cedula getCedula() {
        return Cedula;
    }

    public void setCedula(Cedula Cedula) {
        this.Cedula = Cedula;
    } 

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdCedula512() {
        return idCedula512;
    }

    public void setIdCedula512(int idCedula512) {
        this.idCedula512 = idCedula512;
    }

    public int getNumEquipo() {
        return numEquipo;
    }

    public void setNumEquipo(int numEquipo) {
        this.numEquipo = numEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

   

   

    
    
    
}
