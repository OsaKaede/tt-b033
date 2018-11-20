package com.cacei.version1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.cacei.version1.model.Laboratorio;

@Controller
@RequestMapping("/Cedula512")
public class Cedula512Controller {

	//nombre de la vista
	public static final String FORM_VIEW = "form";
	public static final String RESULT_VIEW= "result";
	
	@GetMapping("/showCedula512")
	public String showForm(Model model) {
//		model.addAttribute("lab", new Laboratorio());
		return FORM_VIEW;	
	}

}
