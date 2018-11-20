/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.service.serviceImplemen;

import com.cacei.version1.entidades.DatosLaboratorio;
import com.cacei.version1.repository.DatosLaboratorioRepositorio;
import com.cacei.version1.service.DatosLaboratorioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service("DatosLaboratorioServicioImple")
public class DatosLaboratorioServicioImple implements DatosLaboratorioServicio{
    
    
     @Autowired
    @Qualifier("DatosLaboratorioRepositorio")
    private DatosLaboratorioRepositorio repo;


    @Override
    public List<DatosLaboratorio> listAllDatosLaboratorio() {
        
        return repo.findAll();
        
    }

    @Override
    public DatosLaboratorio OneDatosLaboratorio(int id) {
        return repo.findByIdDatosLaboratorio(id);
    }

    @Override
    public DatosLaboratorio addDatosLaboratorio(DatosLaboratorio datoslab) {
        return repo.save(datoslab);
    }

    @Override
    public int removeDatosLaboratorio(int id) {
         repo.deleteById(id);
        return 0;
    }

    @Override
    public DatosLaboratorio updateDatosLaboratorio(DatosLaboratorio datoslab) {
        return repo.save(datoslab);
    }

    @Override
    public DatosLaboratorio OneDatosNombreLaboratorio(String nombre) {
        return repo.findByNombreLab(nombre);
    }
    
}
