/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.repository;

import com.cacei.version1.entidades.DatosUsuario;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PC
 */
@Repository("DatosUsuarioRepositorio")
public interface DatosUsuarioRepositorio extends JpaRepository<DatosUsuario,Serializable> {
     public abstract DatosUsuario findByIdDatosUsuario(int id);

   // public DatosUsuario findByNombreLab(String nombre);
}
