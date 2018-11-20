/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.service.serviceImplemen;

import com.cacei.version1.entidades.Cedula;
import com.cacei.version1.repository.CedulaRepositorio;
import com.cacei.version1.service.CedulaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service("CedulaServicioImple")
public class CedulaServicioImple implements CedulaServicio {
    
    
     @Autowired
    @Qualifier("CedulaRepositorio")
    private CedulaRepositorio repo;

    @Override
    public List<Cedula> listAllCedula() {
    
      return repo.findAll();
    }

    @Override
    public Cedula OneCedula(int id) {
        return repo.findByIdCedula(id);
    
    }

    @Override
    public Cedula addCedula(Cedula cedu) {
         return repo.save(cedu);
    }

    @Override
    public int removeCedula(int id) {
        repo.deleteById(id);
        return 0;
    }

    @Override
    public Cedula updateCedula(Cedula cedu) {
        return repo.save(cedu);
    }
    
}
