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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 *
 * @author ilsem
 */
@Entity
@Table(name="Cedula431")
public class Cedula431 {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCedula431")
    private int idCedula431;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idCedula")
    private Cedula Cedula;
    
    @Column(name="Periodicidad")
    private String Periodicidad;
    
    @Column(name="num_per_anio")
    private String num_per_anio;
    
    @Column(name="corte_equiv_5anio")
    private String corte_equiv_5anio;
    
    @Column(name="periodo_corte")
    private String periodo_corte;
    
    @Column(name="num_est_corte")
    private String num_est_corte;
    
    @Column(name="num_est_pe")
    private String num_est_pe;
    
    @Column(name="percent_est_pe")
    private String percent_est_pe;
    
    @Column(name="num_egresados_corte")
    private String num_egresados_corte;
    
    @Column(name="efic_terminal")
    private String efic_terminal;
    
    @Column(name="num_titulados_corte")
    private String num_titulados_corte;
    
    @Column(name="percent_titulacion")
    private String percent_titulacion;
    
    @OneToMany(
    mappedBy = "Cedula431",
    cascade = CascadeType.ALL,
    orphanRemoval = true
    )
    
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Cedula431> Cedula431 = new ArrayList<>();
    
    
    public Cedula431(int idCedula431, Cedula Cedula, String Periodicidad, String num_per_anio, String corte_equiv_5anio, String periodo_corte, String num_est_corte, String num_est_pe, String percent_est_pe, String num_egresados_corte, String efic_terminal, String num_titulados_corte, String percent_titulacion) {
        this.idCedula431 = idCedula431;
        this.Cedula = Cedula;
        this.Periodicidad = Periodicidad;
        this.num_per_anio = num_per_anio;
        this.corte_equiv_5anio = corte_equiv_5anio;
        this.periodo_corte = periodo_corte;
        this.num_est_corte = num_est_corte;
        this.num_est_pe = num_est_pe;
        this.percent_est_pe = percent_est_pe;
        this.num_egresados_corte = num_egresados_corte;
        this.efic_terminal = efic_terminal;
        this.num_titulados_corte = num_titulados_corte;
        this.percent_titulacion = percent_titulacion;
    }

    public List<Cedula431> getCedula431() {
        return Cedula431;
    }

    public void setCedula431(List<Cedula431> Cedula431) {
        this.Cedula431 = Cedula431;
    }

    
    
    public String getCorte_equiv_5anio() {
        return corte_equiv_5anio;
    }

    public void setCorte_equiv_5anio(String corte_equiv_5anio) {
        this.corte_equiv_5anio = corte_equiv_5anio;
    }

    public String getPeriodo_corte() {
        return periodo_corte;
    }

    public void setPeriodo_corte(String periodo_corte) {
        this.periodo_corte = periodo_corte;
    }

    public String getNum_est_corte() {
        return num_est_corte;
    }

    public void setNum_est_corte(String num_est_corte) {
        this.num_est_corte = num_est_corte;
    }

    public String getNum_est_pe() {
        return num_est_pe;
    }

    public void setNum_est_pe(String num_est_pe) {
        this.num_est_pe = num_est_pe;
    }

    public String getPercent_est_pe() {
        return percent_est_pe;
    }

    public void setPercent_est_pe(String percent_est_pe) {
        this.percent_est_pe = percent_est_pe;
    }

    public String getNum_egresados_corte() {
        return num_egresados_corte;
    }

    public void setNum_egresados_corte(String num_egresados_corte) {
        this.num_egresados_corte = num_egresados_corte;
    }

    public String getEfic_terminal() {
        return efic_terminal;
    }

    public void setEfic_terminal(String efic_terminal) {
        this.efic_terminal = efic_terminal;
    }

    public String getNum_titulados_corte() {
        return num_titulados_corte;
    }

    public void setNum_titulados_corte(String num_titulados_corte) {
        this.num_titulados_corte = num_titulados_corte;
    }

    public String getPercent_titulacion() {
        return percent_titulacion;
    }

    public void setPercent_titulacion(String percent_titulacion) {
        this.percent_titulacion = percent_titulacion;
    }

    
    public int getIdCedula431() {
        return idCedula431;
    }

    public void setIdCedula431(int idCedula431) {
        this.idCedula431 = idCedula431;
    }

    public Cedula getCedula() {
        return Cedula;
    }

    public void setCedula(Cedula Cedula) {
        this.Cedula = Cedula;
    }

    public String getPeriodicidad() {
        return Periodicidad;
    }

    public void setPeriodicidad(String Periodicidad) {
        this.Periodicidad = Periodicidad;
    }

    public String getNum_per_anio() {
        return num_per_anio;
    }

    public void setNum_per_anio(String num_per_anio) {
        this.num_per_anio = num_per_anio;
    }

    
}
