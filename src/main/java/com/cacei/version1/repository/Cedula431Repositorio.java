/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.repository;

import com.cacei.version1.entidades.Cedula431;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ilsem
 */
@Repository("Cedula431Repositorio")
public interface Cedula431Repositorio extends JpaRepository<Cedula431, Serializable>{
    public abstract Cedula431 findByIdCedula431(int id);
}
