/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.repository;

import com.cacei.version1.entidades.Cedula512;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PC
 */
@Repository("Cedula512Repositorio")
public interface Cedula512Repositorio extends JpaRepository<Cedula512,Serializable> {
    public abstract Cedula512 findByIdCedula512(int id);
}
