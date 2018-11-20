package com.cacei.version1.controller.ControladoresREST;

import com.cacei.version1.auxiliares.AuxAdminRegis;
import com.cacei.version1.entidades.DatosUsuario;
import com.cacei.version1.entidades.RolUsuario;
import com.cacei.version1.entidades.usuarios;
import com.cacei.version1.service.DatosUsuarioServicio;
import com.cacei.version1.service.ProcedimientosServicio;
import com.cacei.version1.service.RolUsuarioServicio;
import com.cacei.version1.service.usuariosServicio;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author PC
 */
@RestController
@RequestMapping("/rest/Admin")
public class AdminControllerRest {
    @Autowired
    @Qualifier("UsuariosServicioImple")
    private usuariosServicio us;
    
    @Autowired
    @Qualifier("RolUsuarioServicioImple")
    private RolUsuarioServicio us1;
    
    @Autowired
    @Qualifier("DatosUsuarioServicioImple")
    private DatosUsuarioServicio us2;
    
    // Inyectando servico
    @Autowired
    @Qualifier("ProcedimientosServicio")
    private ProcedimientosServicio ProSe;
    
    
     // Retorna 1 usuario
	@PostMapping("/traerUsuario")
	public ResponseEntity<Object> traerdatos(@RequestParam(name="id", required=false) String id) {
//            Bloque de prueba de jackson
//                 ObjectMapper oMapper = new ObjectMapper();
//		// Recibiendo los parámetros
//                RolUsuario obj3 = us1.OneRolUsuario(id);
//                
//                //Convert object to JSON string
//                
//        try {
//           String jsonInString = oMapper.writeValueAsString(obj3);
//           System.out.println("jsonnnnnnn "+jsonInString);
//        } catch (JsonProcessingException ex) {
//            Logger.getLogger(AdminControllerRest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//		
//			
//                System.out.println("jejejej---->>"+obj3.getNombre());
//                Map<String, Object> map = oMapper.convertValue(obj3, new TypeReference<Map<String, Object>>() {});
//                
//                
//                System.out.println(map);
//                
//                
////		Object respuesta = raven.call("sp_badMx_comboDerechohabiencia", params);
//		return new ResponseEntity(map, HttpStatus.OK);


        // Recibiendo los parámetros
		Map<String, Object> params = new HashMap<>();
		params.put("1", id);
		Object respuesta = ProSe.call("buscaUsuarios", params);
		return new ResponseEntity(respuesta, HttpStatus.OK);
	}
        
        
        @PostMapping("/eliminarUsuario")
	public ModelAndView eliminarUsurio(@RequestParam(name="id", required=false) int id) {
                us2.removeDatosUsuario(id);
		return new ModelAndView("redirect:/Cedula/Admin#test6");
	}
    
        
        //Modificar 
        @PostMapping("/modificarUsuario")
        public ModelAndView modiUsu(@ModelAttribute(name = "usuarioAux2") AuxAdminRegis usuAx){
            
            //Zona de impresiones
            System.out.println("nombre---->"+usuAx.getNombre()
                    +"AP---->"+usuAx.getApelldioPaterno()
                    +"Am---->"+usuAx.getApellidoMaterno()
                    +"Email--->"+usuAx.getEmail()
                    +"Telefono--->"+usuAx.getTelefono()
                    +"Rol---->"+usuAx.getNombreRol()
                    +"Nombre_Usuario---->"+usuAx.getNombreUsuario()
                    +"Contrasena---->"+usuAx.getContrasena()
                    +"ID---->"+usuAx.getIdUsuario());
            
//            objeto del rol
          RolUsuario obj3 = us1.OneRolUsuario(usuAx.getNombreRol()); 
//          objeto de usuarios
          usuarios obj2 = new usuarios(Integer.parseInt(usuAx.getIdUsuario()),usuAx.getNombreUsuario(),usuAx.getContrasena(),obj3);   
//          obejeto datos de usuario
          DatosUsuario obj1 = new DatosUsuario(Integer.parseInt(usuAx.getIdUsuario()),usuAx.getNombre(),usuAx.getApelldioPaterno(),usuAx.getApellidoMaterno(), usuAx.getEmail(),usuAx.getTelefono(),obj2);
          
          
          us.addUsuario(obj2);
          
          us2.addDatosUsuario(obj1);
          
        return new ModelAndView("redirect:/Cedula/Admin");
        } 
    
    
}
