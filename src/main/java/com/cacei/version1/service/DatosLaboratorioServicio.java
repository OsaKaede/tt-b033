/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.service;

import com.cacei.version1.entidades.DatosLaboratorio;
import java.util.List;

/**
 *
 * @author PC
 */
public interface DatosLaboratorioServicio {
    
     public abstract List<DatosLaboratorio> listAllDatosLaboratorio();
    public abstract DatosLaboratorio OneDatosLaboratorio(int id);
    public abstract DatosLaboratorio OneDatosNombreLaboratorio(String nombre);
    public abstract DatosLaboratorio addDatosLaboratorio(DatosLaboratorio datoslab); 
    public abstract int removeDatosLaboratorio(int id); 
    public abstract DatosLaboratorio updateDatosLaboratorio(DatosLaboratorio datoslab); 
    
}
