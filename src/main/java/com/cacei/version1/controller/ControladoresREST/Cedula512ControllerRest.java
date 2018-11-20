package com.cacei.version1.controller.ControladoresREST;

import com.cacei.version1.entidades.Cedula;
import com.cacei.version1.entidades.Cedula512;
import com.cacei.version1.entidades.DatosLaboratorio;
import com.cacei.version1.excel.Cedula512xls;
import com.cacei.version1.service.Cedula512Servicio;
import com.cacei.version1.service.CedulaServicio;
import com.cacei.version1.service.DatosLaboratorioServicio;
import com.cacei.version1.service.ProcedimientosServicio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/rest/Cedula")
public class Cedula512ControllerRest {
    @Autowired
    @Qualifier("CedulaServicioImple")
    private CedulaServicio us;
    
    @Autowired
    @Qualifier("Cedula512ServicioImple")
        private Cedula512Servicio us1;
    
    @Autowired
    @Qualifier("DatosLaboratorioServicioImple")
    private DatosLaboratorioServicio us2;
    
    // Inyectando servico
    @Autowired
    @Qualifier("ProcedimientosServicio")
    private ProcedimientosServicio ProSe;
    
    
     // Retorna 1 usuario
	@PostMapping("/GuardarCedula")
	public ModelAndView GuardarCedula(@RequestParam(value="numeros[]", required=false) int[] numeros,
                                          @RequestParam(value="nombres[]", required=false) String[] nombres,
                                          @RequestParam(value="cantidades[]", required=false) int[] cantidades,
                                          @RequestParam(name="nombreLab", required=false) String nombreLab) {
            
                DatosLaboratorio obj1 = crearDatosLaboratorioSiNoExiste(nombreLab);
                Cedula obj2 = us.OneCedula(512);
                
                System.out.println("jajaj-->"+nombreLab);
                 List<Cedula512> arrayCedula512 = new ArrayList();
		for(int i=0;i<numeros.length;i++){
                    System.out.println("numeros:"+numeros[i]+"numeros:"+nombres[i]+"numeros:"+cantidades[i]);
                    Cedula512 obj3 = new Cedula512(0,numeros[i],nombres[i],cantidades[i],obj1,obj2);
                    us1.addCedula512(obj3);
                    arrayCedula512.add(obj3);
                }
             
               /* if(arrayCedula512.size()>0){
                    data.put("datos", arrayCedula512);
                }*/
                Cedula512xls obj512 = new Cedula512xls();
                String respuesta = "";
                respuesta=obj512.GenerarCedulaxls(arrayCedula512);
                
                    
		return new ModelAndView("redirect:/Cedula/Cedula5.1.2");
	}
        
     //Metodo que retorna un laboratorio si existe 
    private DatosLaboratorio crearDatosLaboratorioSiNoExiste(String nombre) {
        DatosLaboratorio DL = us2.OneDatosNombreLaboratorio(nombre);
        if (DL == null) {
            DL = new DatosLaboratorio(0,nombre);
            us2.addDatosLaboratorio(DL);
        }
        return DL;
    }
    
    
//    Metodo para trar los datos de un Lab
    @PostMapping("/ListaElementosLab")
	public ResponseEntity<Object> DatosTabla(@RequestParam(name="idlab", required=false) int idlab) {
		// Recibiendo los parámetros
		Map<String, Object> params = new HashMap<>();
		params.put("1", idlab);
		Object respuesta = ProSe.call("buscaDatosTablaCedula512", params);
		return new ResponseEntity(respuesta, HttpStatus.OK);
	}
    //Borrar un elemnto
        @GetMapping("/borrar/{id}")
	public ModelAndView eliminaele(@PathVariable("id") int id){
		us1.removeCedula512(id);
		return new ModelAndView("redirect:/Cedula/Cedula5.1.2");
	}
        
        
    //Salvar un elemetno
        @PostMapping("/actualizar")
	public ModelAndView Actualizar(@RequestParam(name="idCedula", required=false) int idCedula,
                                       @RequestParam(name="idCedula512", required=false) int idCedula512,
                                       @RequestParam(name="idDatosLaboratorio", required=false) int idDatosLaboratorio,
                                       @RequestParam(name="numEquipo", required=false) int numEquipo,
                                       @RequestParam(name="nombreEquipo", required=false) String nombreEquipo,
                                       @RequestParam(name="cantidad", required=false) int cantidad){
		
            
                 
                DatosLaboratorio obj1  =  us2.OneDatosLaboratorio(idDatosLaboratorio);
                Cedula obj2 = us.OneCedula(idCedula);
                                       
                 Cedula512 obj3 = new Cedula512(idCedula512,numEquipo,nombreEquipo,cantidad,obj1,obj2);
                 us1.addCedula512(obj3);
		return new ModelAndView("redirect:/Cedula/Cedula5.1.2");
	}
        
       /************************Generar XLS************************/
        
        @PostMapping("/GenerarXLS")
	public ModelAndView GenerarXLS(@RequestParam(value="numeros[]", required=false) int[] numeros,
                                          @RequestParam(value="nombres[]", required=false) String[] nombres,
                                          @RequestParam(value="cantidades[]", required=false) int[] cantidades,
                                          @RequestParam(name="nombreLab", required=false) String nombreLab) {
            
                DatosLaboratorio obj1 = crearDatosLaboratorioSiNoExiste(nombreLab);
                Cedula obj2 = us.OneCedula(512);
                
                System.out.println("jajaj-->"+nombreLab);
                
                //Guardaremos todos los objetos que agregará el usuario dinamicamente
                List<Cedula512> arrayCedula512 = new ArrayList();
                

		for(int i=0;i<numeros.length;i++){
                    System.out.println("numeros:"+numeros[i]+"numeros:"+nombres[i]+"numeros:"+cantidades[i]);
                    Cedula512 obj3 = new Cedula512(0,numeros[i],nombres[i],cantidades[i],obj1,obj2);
                    us1.addCedula512(obj3);
                    arrayCedula512.add(obj3);
                }
               /* if(arrayCedula512.size()>0){
                    data.put("datos", arrayCedula512);
                }*/
                Cedula512xls obj512 = new Cedula512xls();
                String respuesta = "";
                respuesta=obj512.GenerarCedulaxls(arrayCedula512);
                
                
		return new ModelAndView("redirect:/Cedula/Cedula5.1.2");
	}
    
}
