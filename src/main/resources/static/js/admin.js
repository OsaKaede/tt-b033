var boton = $("#buscar_us");
var boton_eli = $("#eliminar_us")
var nombre_bu = $("#nombre_bu")
var ap_bu = $("#ap_bu")
var am_bu = $("#am_bu")
var mail_bu = $("#mail_bu")
var id_bu = $("#id_bu")
var  tel_bu = $("#tel_bu")
var rol_bu = $("#rol_bu")
var usu_bu = $("#usu_bu")
var contra_bu = $("#contra_bu")
var Habiitar_f =$("#Habiitar_f")




// evento para trear un solo usuario
boton.on("click",function(){
	var params = {};
	params.id=$("#mail_bu").val();
	console.log(params);
	var ajax = awesomeAjax(params, "/rest/Admin/traerUsuario");
	ajax.done(function(datos){
			console.log(datos)
			console.log(datos.length)
			if(datos.length>0){
			nombre_bu.attr({"placeholder":datos[0].Nombre,"value":datos[0].Nombre})
			ap_bu.attr({"placeholder":datos[0].ApelldioPaterno,"value":datos[0].ApelldioPaterno})
			am_bu.attr({"placeholder":datos[0].ApellidoMaterno,"value":datos[0].ApellidoMaterno})
			id_bu.attr({"placeholder":datos[0].idDatosUsuario,"value":datos[0].idDatosUsuario})
			tel_bu.attr({"placeholder":datos[0].Telefono,"value":datos[0].Telefono})
			usu_bu.attr({"placeholder":datos[0].NombreUsuario,"value":datos[0].NombreUsuario})
			contra_bu.attr({"placeholder":datos[0].contrasena,"value":datos[0].contrasena});
			rol_bu.val(datos[0].idRol);
			$('select').formSelect();	
		}

		else{
			alert("no se encontro usuario")
		}

	})
		.fail(function() {
			console.log("Houston, we have a problem!!");
		});

})


// evento para eliminart un solo usuario
boton_eli.on("click",function(){
	var salir = confirm("¿Desea eliminar al usuario?");
				if(salir==true)
				{
				var params = {};
				params.id=id_bu.val();
				console.log(params);
				awesomeAjax(params, "/rest/Admin/eliminarUsuario");
				alert("usuario ELiminado")
				window.location="/Cedula/Admin"
				}
				else
				return false;

})

// evento para habilitar elemetos
Habiitar_f.on("click",function(){	

	nombre_bu.prop('disabled', false);
	ap_bu.prop('disabled', false);
	am_bu.prop('disabled', false);
	id_bu.prop('disabled', false);
	tel_bu.prop('disabled', false);
	rol_bu.prop('disabled', false);
	usu_bu.prop('disabled', false);
	boton_eli.removeAttr("disabled");
	$("#Actualizar_us").removeAttr("disabled");
	$('select').formSelect();
	contra_bu.prop('disabled', false);
})

