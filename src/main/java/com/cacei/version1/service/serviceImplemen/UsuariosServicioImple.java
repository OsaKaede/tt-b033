/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.service.serviceImplemen;

import com.cacei.version1.entidades.usuarios;
import com.cacei.version1.repository.UsuariosRepositorio;
import com.cacei.version1.service.usuariosServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service("UsuariosServicioImple")
public class UsuariosServicioImple implements usuariosServicio {
    
    @Autowired
    @Qualifier("UsuariosRepositorio")
    private UsuariosRepositorio repo;

    @Override
    public List<usuarios> listAllUsuarios() {
        return repo.findAll();
    }

    @Override
    public usuarios OneUsuario(int id) {
        return repo.findByIdUsuario(id);
    }

    @Override
    public usuarios addUsuario(usuarios usuario) {
        return repo.save(usuario);
    }

    @Override
    public int removeUsuarios(int id) {
        repo.deleteById(id);
        return 0;
    }

    @Override
    public usuarios updateUsuario(usuarios usuario) {
          return repo.save(usuario);
    }
    
}
