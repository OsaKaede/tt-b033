/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.service;

import com.cacei.version1.entidades.Cedula512;
import java.util.List;

/**
 *
 * @author PC
 */
public interface Cedula512Servicio {
    
      public abstract List<Cedula512> listAllCedula512();
    public abstract Cedula512 OneCedula512(int id);
    public abstract Cedula512 addCedula512(Cedula512 cedu512); 
    public abstract int removeCedula512(int id); 
    public abstract Cedula512 updateCedula512(Cedula512 cedu512); 
    
}
