/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.service.serviceImplemen;

import com.cacei.version1.service.ProcedimientosServicio;
import com.cacei.version1.utils.AwesomeStoredProcedure;
import java.sql.Types;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service("ProcedimientosServicio")
public class ProcedimientosServicioImple implements ProcedimientosServicio{    
    // Este es nuestro enlace a la BD
     private final JdbcTemplate jt;
    @Autowired
     public ProcedimientosServicioImple(JdbcTemplate jt) {
		this.jt = jt;
     }

    @Override
    public Object call(String nombreSP, Map<String, Object> params) {
       // Inicializa conexiones y objetos
	AwesomeStoredProcedure asp = new AwesomeStoredProcedure(jt, nombreSP);
       // Inicializa parámetros
	for (String key : params.keySet())
		asp.declareParameter(new SqlParameter(key, Types.VARCHAR));
	// Go for it...
	Map<String, Object> map = asp.execute(params);
	// Tomar lo que nos interesa
	return map.get("#result-set-1");
    
    }
    
}
