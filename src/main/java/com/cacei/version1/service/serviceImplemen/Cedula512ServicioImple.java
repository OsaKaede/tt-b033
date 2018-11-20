/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.service.serviceImplemen;


import com.cacei.version1.entidades.Cedula512;
import com.cacei.version1.repository.Cedula512Repositorio;
import com.cacei.version1.service.Cedula512Servicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service("Cedula512ServicioImple")
public class Cedula512ServicioImple implements Cedula512Servicio {
    
    
    @Autowired
    @Qualifier("Cedula512Repositorio")
    private Cedula512Repositorio repo;

    @Override
    public List<Cedula512> listAllCedula512() {
    
      return repo.findAll();
    }

    @Override
    public Cedula512 OneCedula512(int id) {
        return repo.findByIdCedula512(id);
    
    }

    @Override
    public Cedula512 addCedula512(Cedula512 cedu512) {
         return repo.save(cedu512);
    }

    @Override
    public int removeCedula512(int id) {
        repo.deleteById(id);
        return 0;
    }

    @Override
    public Cedula512 updateCedula512(Cedula512 cedu512) {
        return repo.save(cedu512);
    }
    
}
