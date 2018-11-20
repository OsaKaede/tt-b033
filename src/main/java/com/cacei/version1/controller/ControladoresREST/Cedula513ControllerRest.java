/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.controller.ControladoresREST;

import com.cacei.version1.entidades.Cedula;
import com.cacei.version1.entidades.Cedula513;
import com.cacei.version1.excel.Cedula513xls;
import com.cacei.version1.service.Cedula513Servicio;
import com.cacei.version1.service.CedulaServicio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ilsem
 */

@RestController
@RequestMapping("/rest/Cedula513")
public class Cedula513ControllerRest {
    @Autowired
    @Qualifier("CedulaServicioImple")
    private CedulaServicio ced;
    
    @Autowired
    @Qualifier("Cedula513ServicioImple")
    private Cedula513Servicio ced51;
    
    
     @PostMapping("/GuardarCedula513")
    public ModelAndView GuardarCedula513 (@RequestParam(value="group1", required=false) String opc1,
                                          @RequestParam(value="group2", required=false) String opc2,
                                          @RequestParam(value="group3", required=false) String opc3,
                                          @RequestParam(value="group4", required=false) String opc4,
                                          @RequestParam(value="group5", required=false) String opc5,
                                          @RequestParam(value="group6", required=false) String opc6,
                                          @RequestParam(value="group7", required=false) String opc7,
                                          @RequestParam(value="group8", required=false) String opc8,
                                          @RequestParam(value="group9", required=false) String opc9,
                                          @RequestParam(value="Laboratorio", required=false) String lab){
        
        Cedula obj2 =  ced.OneCedula(513);
        
        System.out.println("Prueba---> "+opc1);
        Cedula513 obj3 = new Cedula513(0,obj2, lab, opc1, opc2, opc3, opc4, opc5,
                                opc6, opc7, opc8, opc9);
        
        ced51.addCedula513(obj3);

        
        return new ModelAndView("redirect:/Cedula/Cedula5.1.3");
        
    
    }
    
    
    @PostMapping("/GenerarXLS")
    public ModelAndView GenerarXLS (@RequestParam(value="group1", required=false) String opc1,
                                          @RequestParam(value="group2", required=false) String opc2,
                                          @RequestParam(value="group3", required=false) String opc3,
                                          @RequestParam(value="group4", required=false) String opc4,
                                          @RequestParam(value="group5", required=false) String opc5,
                                          @RequestParam(value="group6", required=false) String opc6,
                                          @RequestParam(value="group7", required=false) String opc7,
                                          @RequestParam(value="group8", required=false) String opc8,
                                          @RequestParam(value="group9", required=false) String opc9,
                                          @RequestParam(value="Laboratorio", required=false) String lab){

       
        
        Cedula obj2 =  ced.OneCedula(513);
        System.out.println("Prueba---> "+opc1);

        Cedula513 obj3 = new Cedula513(0,obj2, lab, opc1, opc2, opc3, opc4, opc5,
                                opc6, opc7, opc8, opc9);
        
        ced51.addCedula513(obj3);
     
        return new ModelAndView("redirect:/Cedula/Cedula5.1.3");
        

    
        
    }
}
