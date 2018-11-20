/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.service;

import com.cacei.version1.entidades.DatosUsuario;
import com.cacei.version1.entidades.RolUsuario;
import java.util.List;

/**
 *
 * @author PC
 */
public interface DatosUsuarioServicio {
    
     public abstract List<DatosUsuario> listAllDatosUsuario();
    public abstract DatosUsuario OneDatosUsuario(int id);
//    public abstract DatosUsuario OneDatosUsuarioNomLab(String nombreLab);
    public abstract DatosUsuario addDatosUsuario(DatosUsuario daUser); 
    public abstract int removeDatosUsuario(int id); 
    public abstract DatosUsuario updateDatosUsuario(DatosUsuario daUser); 

    
}
