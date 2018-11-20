var botonSave = $("#botonSave");
var generarXLS = $("#generarXLS");
// funcion para llenar el params con los colores de los radio botones
botonSave.on("click",function (enviarRadios){
	var params={};
	var filas = $("tr").length;
	params['Laboratorio']=$("#lab_or_taller").val();
	for (var e = 1; e <= filas; e++) {
		var elemento  = 'group'+e
		//console.log(elemento)
		var radios = document.getElementsByName(elemento);
		for (var i = 0, length = radios.length; i < length; i++)
		{
			 if (radios[i].checked)
			 {
			 params['group'+e]=radios[i].value;
			  //console.log(radios[i].value);
			  break;
			 }
	    }
	}

	console.log(params)
	awesomeAjax(params,"/rest/Cedula513/GuardarCedula513");
	window.location="/Cedula/Cedula5.1.3"
}
/*****************Generar Cedula xls**********************/
generarXLS.on("click",function(){
    var params={};
	var filas = $("tr").length;
	params['Laboratorio']=$("#lab_or_taller").val();
	for (var e = 1; e <= filas; e++) {
		var elemento  = 'group'+e
		//console.log(elemento)
		var radios = document.getElementsByName(elemento);
		for (var i = 0, length = radios.length; i < length; i++)
		{
			 if (radios[i].checked)
			 {
			 params['group'+e]=radios[i].value;
			  //console.log(radios[i].value);
			  break;
			 }
	    }
	}

	console.log(params)
	awesomeAjax(params,"/rest/Cedula513/GuardarCedula513");
	window.location="/Cedula/Cedula5.1.3"
    
});