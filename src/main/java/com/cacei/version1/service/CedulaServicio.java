/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.service;

import com.cacei.version1.entidades.Cedula;
import java.util.List;

/**
 *
 * @author PC
 */
public interface CedulaServicio {
    
    public abstract List<Cedula> listAllCedula();
    public abstract Cedula OneCedula(int id);
    public abstract Cedula addCedula(Cedula cedu); 
    public abstract int removeCedula(int id); 
    public abstract Cedula updateCedula(Cedula cedu); 
    
}
