/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.service;

import com.cacei.version1.entidades.Cedula511;
import java.util.List;

/**
 *
 * @author ilsem
 */
public interface Cedula511Servicio {
 public abstract List<Cedula511> listAllCedula513();
 public abstract Cedula511 OneCedula511(int id);
 public abstract Cedula511 addCedula511(Cedula511 cedu511);
 public abstract int removeCedula511 (int id);
 public abstract Cedula511 updateCedula511(Cedula511 cedu511);
}
