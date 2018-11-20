/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.service.serviceImplemen;

import com.cacei.version1.entidades.RolUsuario;
import com.cacei.version1.repository.RolUsuariosRepositorio;
import com.cacei.version1.service.RolUsuarioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service("RolUsuarioServicioImple")
public class RolUsuarioServicioImple implements RolUsuarioServicio{
    
     @Autowired
    @Qualifier("RolUsuariosRepositorio")
    private RolUsuariosRepositorio repo;

    @Override
    public List<RolUsuario> listAllRolUsuario() {
        return repo.findAll();
    }

    @Override
    public RolUsuario OneRolUsuario(String id) {
        RolUsuario obj = repo.findByIdRol(id);
        System.out.println("Rolecito: " + obj.getIdRol() + " nombre: " + obj.getNombre());
        return repo.findByIdRol(id);
    }

    @Override
    public RolUsuario addRolUsuario(RolUsuario rolUser) {
        return repo.save(rolUser);
    }

    @Override
    public int removeRolUsuario(int id) {
        repo.deleteById(id);
        return 0;
    }

    @Override
    public RolUsuario updateRolUsuario(RolUsuario rolUser) {
        return repo.save(rolUser);
    }
    
}
