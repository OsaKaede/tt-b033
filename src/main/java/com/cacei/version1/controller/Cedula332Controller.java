package com.cacei.version1.controller;

import com.cacei.version1.auxiliares.AuxAdminRegis;
import com.cacei.version1.auxiliares.AuxCed513;
import com.cacei.version1.entidades.DatosUsuario;
import com.cacei.version1.entidades.RolUsuario;
import com.cacei.version1.entidades.usuarios;
import com.cacei.version1.service.DatosLaboratorioServicio;
import com.cacei.version1.service.DatosUsuarioServicio;
import com.cacei.version1.service.EmailServicio;
import com.cacei.version1.service.RolUsuarioServicio;
import com.cacei.version1.service.usuariosServicio;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Cedula")
public class Cedula332Controller {
	//private static final Log LOGGER = LogFactory.getLog(Cedula332Controller.class);
    
    @Autowired
    @Qualifier("UsuariosServicioImple")
    private usuariosServicio us;
    
    @Autowired
    @Qualifier("RolUsuarioServicioImple")
    private RolUsuarioServicio us1;
    
    @Autowired
    @Qualifier("DatosUsuarioServicioImple")
    private DatosUsuarioServicio us2;
    
    @Autowired
    @Qualifier("DatosLaboratorioServicioImple")
    private DatosLaboratorioServicio Lab;
    
    
    @Autowired
    @Qualifier("emailServicio")
    private EmailServicio es;
	
	@GetMapping("/Cedula3.3.2")
	public String Cedula3(){
		//LOGGER.info("METHOD 'Cedula3.3.2'");
		return "Cedula3.3.2";
	}
	@GetMapping("/Cedula4.4.1")
	public String Cedula4() {
		return "Cedula4.4.1";
	}
	@GetMapping("/Cedula4.3.1")
	public String Cedula43() {
		return "Cedula4.3.1";
	}
	@GetMapping("/Cedula5.1.2")
	public ModelAndView Cedula5() {
            ModelAndView mav = new ModelAndView("Cedula5.1.2");
            mav.addObject("laboratorios",Lab.listAllDatosLaboratorio());
	    return mav;
	}
	@GetMapping("/Cedula5.1.3")
	public String Cedula53() {
		return "Cedula5.1.3";
	}
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	@GetMapping("/Admin")
	public ModelAndView Admin() {
                ModelAndView mav = new ModelAndView("Admin");
                mav.addObject("usuarios",us1.listAllRolUsuario());
                mav.addObject("usuarioAux",new AuxAdminRegis());
                mav.addObject("usuarioAux2",new AuxAdminRegis());
		return mav;
	}
	@GetMapping("/Cedula5.1.1")
	public String Cedula511(){
		return "Cedula5.1.1";
	}
	@GetMapping("/Cedula0")
	public String Cedula0(){
		return "Cedula0";
	}
        
        // lista de usuarios
	@GetMapping("/lista")
	public ModelAndView prueba(){
		ModelAndView mav = new ModelAndView("prueba");
                
                System.out.println("usuario---->"+us1.listAllRolUsuario().get(0));
                mav.addObject("usuarios",us1.listAllRolUsuario());
//                mav.addObject("jugador", new Jugadores());
		return mav;
	}
        
        
        //agregar un jugador
        @PostMapping("/agregaUsuario")
        public String addJuga(@ModelAttribute(name = "usuarioAux") AuxAdminRegis usuAx){
            
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
          usuarios obj2 = new usuarios(0,usuAx.getNombreUsuario(),usuAx.getContrasena(),obj3);   
//          obejeto datos de usuario
          DatosUsuario obj1 = new DatosUsuario(usuAx.getNombre(),usuAx.getApelldioPaterno(),usuAx.getApellidoMaterno(), usuAx.getEmail(),usuAx.getTelefono(),obj2);
          
          
          us.addUsuario(obj2);
          
          us2.addDatosUsuario(obj1);
          
          
          SimpleMailMessage passwordResetEmail = new SimpleMailMessage();
	  //passwordResetEmail.setFrom("sanetimss@gmail.com"); Innecesario ya que se establece desde el application .yml
	   passwordResetEmail.setTo(usuAx.getEmail());
	   passwordResetEmail.setSubject("Confirmacion de registro");
	   passwordResetEmail.setText("Tu registro fue exitoso"); 
	  es.sendEmail(passwordResetEmail);
        return "redirect:/Cedula/Admin";
        } 
        
        
        /***********************Agregar Cedula 513************************/
        /*@PostMapping("/agregaCedula513")
        public String addCedula513(@ModelAttribute(name = "ced513Aux") AuxCed513 axCed513){
            
            //Zona de impresiones
            System.out.println("nombre---->"+axCed513.getNombre()
                    +"AP---->"+axCed513.getApelldioPaterno()
                    +"Am---->"+axCed513.getApellidoMaterno()
                    +"Email--->"+axCed513.getEmail()
                    +"Telefono--->"+axCed513.getTelefono()
                    +"Rol---->"+axCed513.getNombreRol()
                    +"Nombre_Usuario---->"+axCed513.getNombreUsuario()
                    +"Contrasena---->"+axCed513.getContrasena()
                    +"ID---->"+axCed513.getIdUsuario());
            
//            objeto del rol
          RolUsuario obj3 = us1.OneRolUsuario(usuAx.getNombreRol()); 
//          objeto de usuarios
          usuarios obj2 = new usuarios(0,usuAx.getNombreUsuario(),usuAx.getContrasena(),obj3);   
//          obejeto datos de usuario
          DatosUsuario obj1 = new DatosUsuario(usuAx.getNombre(),usuAx.getApelldioPaterno(),usuAx.getApellidoMaterno(), usuAx.getEmail(),usuAx.getTelefono(),obj2);
          
          
          us.addUsuario(obj2);
          
          us2.addDatosUsuario(obj1);
          
          
          SimpleMailMessage passwordResetEmail = new SimpleMailMessage();
	  //passwordResetEmail.setFrom("sanetimss@gmail.com"); Innecesario ya que se establece desde el application .yml
	   passwordResetEmail.setTo(usuAx.getEmail());
	   passwordResetEmail.setSubject("Cinfrimacion de registro");
	   passwordResetEmail.setText("Tu registro fue exitoso"); 
	  es.sendEmail(passwordResetEmail);
        return "redirect:/Cedula/Admin";
        } */
        
        
	
	
}
