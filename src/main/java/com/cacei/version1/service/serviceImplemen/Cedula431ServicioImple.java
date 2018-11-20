/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.service.serviceImplemen;

import com.cacei.version1.entidades.Cedula431;
import com.cacei.version1.repository.Cedula431Repositorio;
import com.cacei.version1.service.Cedula431Servicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author ilsem
 */
@Service("Cedula431ServicioImple")
public class Cedula431ServicioImple implements Cedula431Servicio{
    @Autowired
    @Qualifier("Cedula431Repositorio")
    private Cedula431Repositorio repo;
    
    @Override
    public List<Cedula431> listAllCedula431() {
        return repo.findAll();
    }

    @Override
    public Cedula431 OneCedula431(int id) {
        return repo.findByIdCedula431(id);
    }

    @Override
    public Cedula431 addCedula431(Cedula431 ced431) {
        return repo.save(ced431);
        
    }

    @Override
    public int removeCedula431(int id) {
        repo.deleteById(id);
        return 0;
    }

    @Override
    public Cedula431 updateCedula431(Cedula431 ced431) {
        return repo.save(ced431);
    }
    
}
