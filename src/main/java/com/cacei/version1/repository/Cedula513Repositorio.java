/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.repository;

import com.cacei.version1.entidades.Cedula513;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ilsem
 */
@Repository("Cedula513Repositorio")
public interface Cedula513Repositorio extends JpaRepository<Cedula513, Serializable>{
    public abstract Cedula513 findByIdCedula513(int id);
}
