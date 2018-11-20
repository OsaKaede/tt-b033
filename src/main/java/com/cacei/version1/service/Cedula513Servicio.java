/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.service;

import com.cacei.version1.entidades.Cedula513;
import java.util.List;

/**
 *
 * @author ilsem
 */
public interface Cedula513Servicio {
    public abstract List<Cedula513> listAllCedula513();
    public abstract Cedula513 OneCedula513(int id);
    public abstract Cedula513 addCedula513(Cedula513 cedu513);
    public abstract int removeCedula513(int id);
    public abstract Cedula513 updateCedula513(Cedula513 cedu513);
}
