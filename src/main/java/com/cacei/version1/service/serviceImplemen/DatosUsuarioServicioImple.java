/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.service.serviceImplemen;

import com.cacei.version1.entidades.DatosUsuario;
import com.cacei.version1.repository.DatosUsuarioRepositorio;
import com.cacei.version1.service.DatosUsuarioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service("DatosUsuarioServicioImple")
public class DatosUsuarioServicioImple implements DatosUsuarioServicio  {

     @Autowired
    @Qualifier("DatosUsuarioRepositorio")
    private DatosUsuarioRepositorio repo;

    
    @Override
    public List<DatosUsuario> listAllDatosUsuario() {
        return repo.findAll();
    }

    @Override
    public DatosUsuario OneDatosUsuario(int id) {
         return repo.findByIdDatosUsuario(id);
    }
    
////     @Override
////    public DatosUsuario OneDatosUsuarioNomLab(String nombre) {
////         return repo.findByNombreLab(nombre);
////    }
    

    @Override
    public DatosUsuario addDatosUsuario(DatosUsuario daUser) {
        System.out.println("sout--->"+daUser.getUsuario().getIdUsuario());
        return repo.save(daUser);
    }

    @Override
    public int removeDatosUsuario(int id) {
        repo.deleteById(id);
        return 0;
    }

    @Override
    public DatosUsuario updateDatosUsuario(DatosUsuario daUser) {
        return repo.save(daUser);
    }

//    @Override
//    public DatosUsuario OneDatosUsuarioNomLab(String nombreLab) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
}
