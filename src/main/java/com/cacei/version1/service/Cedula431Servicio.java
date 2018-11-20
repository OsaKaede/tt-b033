/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.service;

import com.cacei.version1.entidades.Cedula431;
import java.util.List;

/**
 *
 * @author ilsem
 */
public interface Cedula431Servicio {
    public abstract List<Cedula431> listAllCedula431();
    public abstract Cedula431 OneCedula431(int id);
    public abstract Cedula431 addCedula431(Cedula431 ced431); 
    public abstract int removeCedula431(int id); 
    public abstract Cedula431 updateCedula431(Cedula431 ced431);   
    
}
