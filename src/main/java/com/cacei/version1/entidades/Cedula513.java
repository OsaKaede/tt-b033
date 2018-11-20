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
@Table(name="Cedula513")
public class Cedula513 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCedula513")
    private int idCedula513;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idCedula")
    private Cedula Cedula;
    
    @Column(name="LabOTaller")
    private String LabOTaller;
    
    @Column(name="RespSuficiencia")
    private String RespSuficiencia;
    
    @Column(name="RespFuncionalidad")
    private String RespFuncionalidad;
    
    @Column(name="RespSeguridad")
    private String RespSeguridad;
    
    @Column(name="RespAislaRui")
    private String RespAislaRui;
    
    @Column(name="RespMobiliario")
    private String RespMobiliario;
    
    @Column(name="RespAccesibi")
    private String RespAccesibi;
    
    @Column(name="RespConect")
    private String RespConect;
    
    @Column(name="RespHigiene")
    private String RespHigiene;
    
    @Column(name="RespEquipoAudio")
    private String RespEquipoAudio;

    public Cedula513(){}

    public Cedula513(int idCedula513, Cedula Cedula, String LabOTaller, String RespSuficiencia, String RespFuncionalidad, String RespSeguridad, String RespAislaRui, String RespMobiliario, String RespAccesibi, String RespConect, String RespHigiene, String RespEquipoAudio) {
        this.idCedula513 = idCedula513;
        this.Cedula = Cedula;
        this.LabOTaller = LabOTaller;
        this.RespSuficiencia = RespSuficiencia;
        this.RespFuncionalidad = RespFuncionalidad;
        this.RespSeguridad = RespSeguridad;
        this.RespAislaRui = RespAislaRui;
        this.RespMobiliario = RespMobiliario;
        this.RespAccesibi = RespAccesibi;
        this.RespConect = RespConect;
        this.RespHigiene = RespHigiene;
        this.RespEquipoAudio = RespEquipoAudio;
    }

    
    public int getIdCedula513() {
        return idCedula513;
    }

    public void setIdCedula513(int idCedula513) {
        this.idCedula513 = idCedula513;
    }

    public Cedula getCedula() {
        return Cedula;
    }

    public void setCedula(Cedula Cedula) {
        this.Cedula = Cedula;
    }

    public String getLabOTaller() {
        return LabOTaller;
    }

    public void setLabOTaller(String LabOTaller) {
        this.LabOTaller = LabOTaller;
    }

    public String getRespSuficiencia() {
        return RespSuficiencia;
    }

    public void setRespSuficiencia(String RespSuficiencia) {
        this.RespSuficiencia = RespSuficiencia;
    }

    public String getRespFuncionalidad() {
        return RespFuncionalidad;
    }

    public void setRespFuncionalidad(String RespFuncionalidad) {
        this.RespFuncionalidad = RespFuncionalidad;
    }

    public String getRespSeguridad() {
        return RespSeguridad;
    }

    public void setRespSeguridad(String RespSeguridad) {
        this.RespSeguridad = RespSeguridad;
    }

    public String getRespAislaRui() {
        return RespAislaRui;
    }

    public void setRespAislaRui(String RespAislaRui) {
        this.RespAislaRui = RespAislaRui;
    }

    public String getRespMobiliario() {
        return RespMobiliario;
    }

    public void setRespMobiliario(String RespMobiliario) {
        this.RespMobiliario = RespMobiliario;
    }

    public String getRespAccesibi() {
        return RespAccesibi;
    }

    public void setRespAccesibi(String RespAccesibi) {
        this.RespAccesibi = RespAccesibi;
    }

    public String getRespConect() {
        return RespConect;
    }

    public void setRespConect(String RespConect) {
        this.RespConect = RespConect;
    }

    public String getRespHigiene() {
        return RespHigiene;
    }

    public void setRespHigiene(String RespHigiene) {
        this.RespHigiene = RespHigiene;
    }

    public String getRespEquipoAudio() {
        return RespEquipoAudio;
    }

    public void setRespEquipoAudio(String RespEquipoAudio) {
        this.RespEquipoAudio = RespEquipoAudio;
    }
    
    
}
