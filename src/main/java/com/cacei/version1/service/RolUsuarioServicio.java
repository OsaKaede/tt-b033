/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.service;

import com.cacei.version1.entidades.RolUsuario;
import java.util.List;

/**
 *
 * @author PC
 */
public interface RolUsuarioServicio {
    
      public abstract List<RolUsuario> listAllRolUsuario();
    public abstract RolUsuario OneRolUsuario(String id);
    public abstract RolUsuario addRolUsuario(RolUsuario rolUser); 
    public abstract int removeRolUsuario(int id); 
    public abstract RolUsuario updateRolUsuario(RolUsuario rolUser); 

    
}
