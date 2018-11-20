// funcion para llenar el params con los calores de los radio botones
function enviarRadios(){
	var params={};
	var filas = $("tr").length;
	params['TipoAula']=$("#tipoAula").val();
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
	awesomeAjax(params,"/rest/Cedula511/GuardarCedula511");
	window.location="/Cedula/Cedula5.1.1"
}

