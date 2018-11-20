var botonSave = $("#botonSave");

$(document).ready(function(){
    $('.tooltipped').tooltip();
     $('.modal').modal();
  });
  /***Aumentar la dimension de la tabla **/

    var agregaT = 1;
    $(document).on('click', '#agregarTable', function(){
        $("#valorIndices").append(
                " <tr>"+
                   "<td id='corteEq5"+agregaT+"'><center><b>"+agregaT+"</b></center></td>"+
                    " <td>"+
                        " <div class='input-field col s6'>"+
                            "<input placeholder='*********' id='periodoCohorte"+agregaT+"' type='text' class='validate'>"+
                          "</div>"+
                    " </td>"+
                     "<td>"+
                           "<div class='input-field col s3'>"+
                              "<input placeholder='*********' id='numEst"+agregaT+"' type='text' class='validate'>"+
                           " </div>"+
                      "</td>"+
                       "<td>"+
                            "<div class='input-field col s3'>"+
                                 "<input placeholder='*********' id='estPE"+agregaT+"' type='text' class='validate'>"+
                             "</div>"+
                       "</td>"+
                       "<td>"+
                            "<div class='input-field col s3'>"+
                                  "<input placeholder='*********' disabled id='percentEstPE"+agregaT+"' type='text' class='validate'>"+
                            "</div>"+
                        "</td>"+ 
                       "<td>"+
                            "<div class='input-field col s3'>"+
                                  "<input placeholder='*********' id='EgreCorte"+agregaT+"' type='text' class='validate'>"+
                            "</div>"+
                        "</td>"+
                        "<td>"+
                            "<div class='input-field col s3'>"+
                                "<input placeholder='*********' disabled id='EficienciaTer"+agregaT+"' type='text' class='validate'>"+
                            "</div>"+
                        "</td>"+
                        "<td>"+
                            "<div class='input-field col s3'>"+
                                " <input placeholder='*********' id='numTitulados"+agregaT+"' type='text' class='validate'>"+
                            "</div>"+
                        "</td>"+
                        "<td>"+
                              "<div class='input-field col s3'>"+
                                  "<input placeholder='*********' disabled id='pecentTit"+agregaT+"' type='text' class='validate'>"+
                              "</div>"+
                       "</td>"+
                    "</tr>"
                );
        agregaT++;
    });
    
    /********************Tabla Asignaturas Con Mayor Índice de Reprobación**************************/
   var agregaAsig = 1;
    $(document).on('click', '#agregarAsignaturas', function(){
        $("#tableAsiganturas").append(
                " <tr>"+
                    " <td>"+
                        " <div class='input-field'>"+
                            "<input placeholder='*********' id='asignatura"+agregaAsig+"' type='text' class='validate'>"+
                          "</div>"+
                    " </td>"+
                     "<td>"+
                           "<div class='input-field'>"+
                              "<input placeholder='**' id='ubicacionSem"+agregaAsig+"' type='text' class='validate'>"+
                           " </div>"+
                      "</td>"+
                       "<td>"+
                            "<div class='input-field'>"+
                                 "<input placeholder='*********' id='periodoImpart"+agregaAsig+"' type='text' class='validate'>"+
                             "</div>"+
                       "</td>"+
                       "<td>"+
                            "<div class='input-field'>"+
                                  "<input placeholder='*********' id='indiceRepro"+agregaAsig+"' type='text' class='validate'>"+
                            "</div>"+
                        "</td>"+                
                    "</tr>"
                );
        agregaAsig++;
    });
    
    /**********************Calcular Porcentajes*************************/
  $(document).on('click', '#calcularPorcentajes', function(){
      var numEstC3=0;
      var numEstPE4=0;
      var EgreCorte6=0;
      var numTitulados8=0;
      var auxEstPE=0;
      var auxTitulados=0;
      var Eficiencia=0;
      
      for(var i=(agregaT-1); i>0; i--){
         numEstPE4= parseInt($("#estPE"+i).val());
         numEstC3= parseInt($("#numEst"+i).val());
         EgreCorte6= parseInt($("#EgreCorte"+i).val());
         numTitulados8= parseInt($("#numTitulados"+i).val());
         
         auxEstPE=numEstPE4/numEstC3;
         Eficiencia=EgreCorte6/numEstC3;
         auxTitulados=numTitulados8/numEstC3;
         
         $("#percentEstPE"+i).val(""+auxEstPE);
         $("#EficienciaTer"+i).val(""+Eficiencia);
         $("#pecentTit"+i).val(""+auxTitulados);
          
      }
      
      });
      
      $(document).on('click', '#ayuda', function(){
          $("#modal1").modal('open');
      });
      
      botonSave.on("click",function(){
	alert(agregaT);
        var cortesEqu5an=[];
	var peridoxCorte=[];
	var numEst=[];
        var estPE=[];
        var percentEstPE=[];
	var EgreCorte=[];
        var EficienciaTer=[];
        var numTitulados=[];
        var pecentTit=[];
        /***/
        var asignatura = [];
        var ubicacionSem = [];
        var periodoImpart = [];
        var indiceRepro= [];
        
        /******************Agregar datos de Valoración*********************/
	for (var i = 1; i < agregaT ; i++) {
                cortesEqu5an[i-1]=$("#corteEq5"+i).va();
		peridoxCorte[i-1]=$("#periodoCohorte"+i).val();
                numEst[i-1]=$("#numEst"+i).val();
                estPE[i-1]=$("#estPE"+i).val();
                percentEstPE[i-1]=$("#percentEstPE"+i).val();
                EgreCorte[i-1]=$("#EgreCorte"+i).val();
                EficienciaTer[i-1]=$("#EficienciaTer"+i).val();
                numTitulados[i-1]=$("#numTitulados"+i).val();
                pecentTit[i-1]=$("#pecentTit"+i).val();
	}
        
        /************************Agregar datos de la Tabla Asignatura***************************/
        for (var i = 1; i < agregaAsig ; i++) {
                asignatura[i-1]=$("#asignatura"+i).va();
		ubicacionSem[i-1]=$("#ubicacionSem"+i).val();
                periodoImpart[i-1]=$("#periodoImpart"+i).val();
                indiceRepro[i-1]=$("#indiceRepro"+i).val();
     	}
        /*****************************MAndamos los datos al Controlador******************************************/
        var params = {}
        params.periodo = $("#periodo").val();
        params.numPeriodos = $("#numPeriodos").val();
        params.peridoxCorte = peridoxCorte;
        params.numEst = numEst;
        params.estPE = estPE;
        params.percentEstPE = percentEstPE;
        params.EgreCorte = EgreCorte;
        params.EficienciaTer = EficienciaTer;
        params.numTitulados = numTitulados;
        params.pecentTit = pecentTit;
        params.cortesEqu5an = cortesEqu5an;
        params.asignatura = asignatura;
        params.ubicacionSem = ubicacionSem;
        params.periodoImpart = periodoImpart;
        params.indiceRepro = indiceRepro;
        
        awesomeAjax(params, "/rest/Cedula431/GuardarCed431");
       	window.location="/Cedula/Cedula4.3.1"

});


/****************Guardar Datos de la Tabla de Asignaturas*************************/

