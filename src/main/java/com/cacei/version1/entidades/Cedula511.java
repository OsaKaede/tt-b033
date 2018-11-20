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
import javax.persistence.Table;

/**
 *
 * @author ilsem
 */
@Entity 
@Table(name="Cedula511")
public class Cedula511 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCedula511")
    private int  idCedula511;
    
    @Column(name="tipoAula")
    private String tipoAula;
    
    @Column(name="respSuficiencia")
    private String respSuficiencia;
    
    @Column(name="respIluminacion")
    private String respIluminacion;
    
    @Column(name="respVentilacion")
    private String respVentilacion;
    
    @Column(name="respAislamiento")
    private String respAislamiento;
    
    @Column(name="respEquipo")
    private String respEquipo;
    
    @Column(name="respMobiliario")
    private String respMobiliario;
    
    @Column(name="respAccesibilidad")
    private String respAccesibilidad;
    
    @Column(name="respConectividad")
    private String respConectividad;
    
    @Column(name="respHigiene")
    private String respHigiene;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idCedula")
    private Cedula Cedula;

    public Cedula511(){}

    public Cedula511(int idCedula511, 
            String tipoAula, String respSuficiencia, 
            String respIluminacion, String respVentilacion, 
            String respAislamiento, String respEquipo, 
            String respMobiliario, String respAccesibilidad, 
            String respConectividad, String respHigiene, 
            Cedula Cedula) {
        this.idCedula511 = idCedula511;
        this.tipoAula = tipoAula;
        this.respSuficiencia = respSuficiencia;
        this.respIluminacion = respIluminacion;
        this.respVentilacion = respVentilacion;
        this.respAislamiento = respAislamiento;
        this.respEquipo = respEquipo;
        this.respMobiliario = respMobiliario;
        this.respAccesibilidad = respAccesibilidad;
        this.respConectividad = respConectividad;
        this.respHigiene = respHigiene;
        this.Cedula = Cedula;
    }
    
    
    
    public int getIdCedula511() {
        return idCedula511;
    }

    public void setIdCedula511(int idCedula511) {
        this.idCedula511 = idCedula511;
    }

    public String getTipoAula() {
        return tipoAula;
    }

    public void setTipoAula(String tipoAula) {
        this.tipoAula = tipoAula;
    }

    public String getRespSuficiencia() {
        return respSuficiencia;
    }

    public void setRespSuficiencia(String respSuficiencia) {
        this.respSuficiencia = respSuficiencia;
    }

    public String getRespIluminacion() {
        return respIluminacion;
    }

    public void setRespIluminacion(String respIluminacion) {
        this.respIluminacion = respIluminacion;
    }

    public String getRespVentilacion() {
        return respVentilacion;
    }

    public void setRespVentilacion(String respVentilacion) {
        this.respVentilacion = respVentilacion;
    }

    public String getRespAislamiento() {
        return respAislamiento;
    }

    public void setRespAislamiento(String respAislamiento) {
        this.respAislamiento = respAislamiento;
    }

    public String getRespEquipo() {
        return respEquipo;
    }

    public void setRespEquipo(String respEquipo) {
        this.respEquipo = respEquipo;
    }

    public String getRespMobiliario() {
        return respMobiliario;
    }

    public void setRespMobiliario(String respMobiliario) {
        this.respMobiliario = respMobiliario;
    }

    public String getRespAccesibilidad() {
        return respAccesibilidad;
    }

    public void setRespAccesibilidad(String respAccesibilidad) {
        this.respAccesibilidad = respAccesibilidad;
    }

    public String getRespConectividad() {
        return respConectividad;
    }

    public void setRespConectividad(String respConectividad) {
        this.respConectividad = respConectividad;
    }

    public String getRespHigiene() {
        return respHigiene;
    }

    public void setRespHigiene(String respHigiene) {
        this.respHigiene = respHigiene;
    }

    public Cedula getCedula() {
        return Cedula;
    }

    public void setCedula(Cedula Cedula) {
        this.Cedula = Cedula;
    }
    
    
}
