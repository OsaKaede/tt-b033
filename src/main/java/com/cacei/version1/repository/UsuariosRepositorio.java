package com.cacei.version1.repository;

import java.io.Serializable;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cacei.version1.entidades.usuarios;


@Repository("UsuariosRepositorio")
public interface UsuariosRepositorio extends JpaRepository<usuarios,Serializable> {
         public abstract usuarios findByIdUsuario(int id);
}
