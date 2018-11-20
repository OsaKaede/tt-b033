/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.controller.ControladoresREST;

import com.cacei.version1.entidades.Cedula;
import com.cacei.version1.entidades.Cedula511;
import com.cacei.version1.service.Cedula511Servicio;
import com.cacei.version1.service.CedulaServicio;
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
@RequestMapping("/rest/Cedula511")
public class Cedula511ControllerRest {
    @Autowired
    @Qualifier("CedulaServicioImple")
    private CedulaServicio ced;
    
    @Autowired
    @Qualifier("Cedula511ServicioImple")
    private Cedula511Servicio ced511;
    
    @PostMapping("/GuardarCedula511")
    public ModelAndView GuardarCedula511 (@RequestParam(value="group1", required=false) String opc1,
                                          @RequestParam(value="group2", required=false) String opc2,
                                          @RequestParam(value="group3", required=false) String opc3,
                                          @RequestParam(value="group4", required=false) String opc4,
                                          @RequestParam(value="group5", required=false) String opc5,
                                          @RequestParam(value="group6", required=false) String opc6,
                                          @RequestParam(value="group7", required=false) String opc7,
                                          @RequestParam(value="group8", required=false) String opc8,
                                          @RequestParam(value="group9", required=false) String opc9,
                                          @RequestParam(value="TipoAula", required=false) String lab){

        Cedula obj2 =  ced.OneCedula(511);
        System.out.println("Prueba---> "+opc1);
        Cedula511 obj3 = new Cedula511(0,lab, opc1, opc2, opc3, opc4, opc5,
                                opc6, opc7, opc8, opc9,obj2);
        ced511.addCedula511(obj3);
        return new ModelAndView("redirect:/Cedula/Cedula5.1.1");
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
                                          @RequestParam(value="TipoAula", required=false) String lab){

        Cedula obj2 =  ced.OneCedula(511);
        System.out.println("Prueba---> "+opc1);
        Cedula511 obj3 = new Cedula511(0,lab, opc1, opc2, opc3, opc4, opc5,
                                opc6, opc7, opc8, opc9,obj2);
        ced511.addCedula511(obj3);
        return new ModelAndView("redirect:/Cedula/Cedula5.1.1");
    }
}
