 
var botonSave = $("#botonSave");
var cuerpoTabla =$("#cuerpoTabla");
var laboSelec = $("#laboSelec");
var generarXLS = $("#generarXLS");

cargarDatos();

laboSelec.change(function() {
	cargarDatos();
});



botonSave.on("click",function(){
	alert(equipoReg)
	var numeros=[];
	var nombres=[];
	var cantidades=[];

	for (var i = 1; i < equipoReg ; i++) {
		numeros[i-1]=i;
		nombres[i-1]=$("#nombre"+i).val();
		cantidades[i-1]=$("#cantidad"+i).val()*1;
	}

	console.log(numeros)
	console.log(nombres)
	console.log(cantidades)

	var params = {};
	params.nombreLab=$("#nombreLab").val();
	params.numeros=numeros;
	params.nombres=nombres;
	params.cantidades=cantidades;
	console.log(params);
	awesomeAjax(params, "/rest/Cedula/GuardarCedula");
	window.location="/Cedula/Cedula5.1.2"

})

function cargarDatos(){
	cuerpoTabla.empty();
	var params = {};
	params.idlab = laboSelec.val();
	console.log(params)
	var ajax = awesomeAjax(params, "/rest/Cedula/ListaElementosLab");
	ajax.done(function(datos){
			console.log(datos);
			for (var i = 0; i < datos.length; i++) {
				cuerpoTabla.append("<tr><td id='nombreEquipo"+i+"' contenteditable='true'>"
									+datos[i].nombreEquipo+"</td><td  id='cantidad"+i+"' contenteditable='true'>"
									+datos[i].cantidad+"</td><td><a href='/rest/Cedula/borrar/"
									+datos[i].idCedula512+"' class='waves-effect  red lighten-1 btn'>Eliminar</a></td><td><a onclick=ActualizarDatos("
									+JSON.stringify(datos[i])+",$('#nombreEquipo"+i+"').text(),$('#cantidad"+i+"').text()) class='waves-effect  light-blue accent-1 btn'>Actualizar</a></td></tr>");
			}
	})
		.fail(function() {
			console.log("Houston, we have a problem!!");
		});



}

function ActualizarDatos(datos,nombre,canti){
	
    var params={};
     params.idCedula=datos.idCedula;
     params.idCedula512=datos.idCedula512;
     params.idDatosLaboratorio=datos.idDatosLaboratorio;
     params.numEquipo=datos.numEquipo;
     params.nombreEquipo=nombre;
     params.cantidad=canti;
     console.log(params);
     alert("Usuario actualizado")
     awesomeAjax(params, "/rest/Cedula/actualizar");
     window.location="/Cedula/Cedula5.1.2";

}
/*****************Generar Cedula xls**********************/
generarXLS.on("click",function(){
        var numeros=[];
	var nombres=[];
	var cantidades=[];

	for (var i = 1; i < equipoReg ; i++) {
		numeros[i-1]=i;
		nombres[i-1]=$("#nombre"+i).val();
		cantidades[i-1]=$("#cantidad"+i).val()*1;
	}

	console.log(numeros)
	console.log(nombres)
	console.log(cantidades)

	var params = {};
	params.nombreLab=$("#nombreLab").val();
	params.numeros=numeros;
	params.nombres=nombres;
	params.cantidades=cantidades;
	console.log(params);
	awesomeAjax(params, "/rest/Cedula/GenerarXLS");
	window.location="/Cedula/Cedula5.1.2"
        
});