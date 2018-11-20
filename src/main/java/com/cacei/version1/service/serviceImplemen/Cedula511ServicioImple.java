/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.service.serviceImplemen;

import com.cacei.version1.entidades.Cedula511;
import com.cacei.version1.repository.Cedula511Repositorio;
import com.cacei.version1.service.Cedula511Servicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author ilsem
 */
@Service("Cedula511ServicioImple")
public class Cedula511ServicioImple implements Cedula511Servicio{
    
    @Autowired
    @Qualifier("Cedula511Repositorio")
    private Cedula511Repositorio repo;
    
    @Override
    public List<Cedula511> listAllCedula513() {
        return repo.findAll();
    }

    @Override
    public Cedula511 OneCedula511(int id) {
        return repo.findByIdCedula511(id);
    }

    @Override
    public Cedula511 addCedula511(Cedula511 cedu511) {
        return repo.save(cedu511);
    }

    @Override
    public int removeCedula511(int id) {
        repo.deleteById(id);
        return 0;
    }

    @Override
    public Cedula511 updateCedula511(Cedula511 cedu511) {
        return repo.save(cedu511);
    }
    
}
