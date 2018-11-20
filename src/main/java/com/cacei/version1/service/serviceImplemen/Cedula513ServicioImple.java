/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.service.serviceImplemen;

import com.cacei.version1.entidades.Cedula513;
import com.cacei.version1.repository.Cedula513Repositorio;
import com.cacei.version1.service.Cedula513Servicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author ilsem
 */
@Service("Cedula513ServicioImple")
public class Cedula513ServicioImple implements Cedula513Servicio{
    @Autowired 
    @Qualifier("Cedula513Repositorio")
    private Cedula513Repositorio repo;

    @Override
    public Cedula513 OneCedula513(int id) {
        return repo.findByIdCedula513(id);
    }

    @Override
    public Cedula513 addCedula513(Cedula513 cedu513) {
        return repo.save(cedu513);
    }

    @Override
    public int removeCedula513(int id) {
        repo.deleteById(id);
        return 0;
    }

    @Override
    public Cedula513 updateCedula513(Cedula513 cedu513) {
        return repo.save(cedu513);
    }

    @Override
    public List<Cedula513> listAllCedula513() {
         return repo.findAll();
    }
    
    
    
    
    
}
