/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.repository;

import com.cacei.version1.entidades.Cedula511;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ilsem
 */
@Repository("Cedula511Repositorio")
public interface Cedula511Repositorio extends JpaRepository<Cedula511, Serializable>{
    public abstract Cedula511 findByIdCedula511(int id);
}
