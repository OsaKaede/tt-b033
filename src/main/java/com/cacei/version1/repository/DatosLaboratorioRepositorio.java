/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.repository;

import com.cacei.version1.entidades.DatosLaboratorio;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PC
 */
@Repository("DatosLaboratorioRepositorio")
public interface DatosLaboratorioRepositorio extends JpaRepository<DatosLaboratorio,Serializable> {
    
public abstract DatosLaboratorio findByIdDatosLaboratorio(int id);
public abstract DatosLaboratorio findByNombreLab(String nombre);

}
