/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.repository;

import com.cacei.version1.entidades.Cedula;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PC
 */
@Repository("CedulaRepositorio")
public interface CedulaRepositorio extends JpaRepository<Cedula,Serializable> {
    public abstract Cedula findByIdCedula(int id);
    
}
