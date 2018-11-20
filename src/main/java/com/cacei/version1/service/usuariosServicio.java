package com.cacei.version1.service;

import com.cacei.version1.entidades.usuarios;
import java.util.List;

public interface usuariosServicio{

    
    public abstract List<usuarios> listAllUsuarios();
    public abstract usuarios OneUsuario(int id);
    public abstract usuarios addUsuario(usuarios jugador); 
    public abstract int removeUsuarios(int id); 
    public abstract usuarios updateUsuario(usuarios jugador); 

}