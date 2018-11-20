
package com.cacei.version1.service;

import java.util.Map;

public interface ProcedimientosServicio { 
    public abstract Object call(String nombreSP, Map<String, Object> params);
}
