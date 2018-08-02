<!DOCTYPE html>
<html>
  <head>
    <title>The Good Pet</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Duru+Sans|Actor' rel='stylesheet' type='text/css'>
    <link href="css/bootshape.css" rel="stylesheet">
  </head>
  <body>
    <!-- aqui la barra de navegacion -->
    <div class="navbar navbar-default navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#"><span class="green">The</span> Good Pet</a>
        </div>
        <nav role="navigation" class="collapse navbar-collapse navbar-right">
          <ul class="navbar-nav nav">
            <li class="active"><a href="index.jsp">Inicio</a></li>
            <li><a href="buscar.jsp">Buscar</a></li>
             <li><a href="registro.jsp">Registrate</a></li>
            <li><a href="cuenta.jsp">Mi cuenta</a></li>
             <li class="dropdown">
              <a data-toggle="dropdown" href="admin.jsp" class="dropdown-toggle">Administra <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="negocio.jsp">Negocios</a></li>
         
          </ul>
        </nav>
      </div>
    </div>

    <!-- Carrusel -->
    <div class="jumbotron">
      <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
      <!-- Controls -->
        
      </div>
    </div>

    <!-- Thumbnails -->
    <div class="container thumbs">
      <div class="col-sm-6 col-md-4">
        <div class="thumbnail">
          <img src="" alt="" class="img-circle">
          <div class="caption">
            <h3 class="text-center"></h3>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4">
        <div class="thumbnail">
          <img src="img/perro1.png" alt="" class="img-circle">
          <div class="caption">
            <h3 class="text-center">Registrate</h3>
           
          </div>
        </div>
      </div>
       <div class="col-sm-6 col-md-4">
        <div class="thumbnail">
          <img src="" alt="" class="img-circle">
          <div class="caption">
            <h3 class="text-center"></h3>
          
          </div>
        </div>
      </div>
          </div>
        </div>
      </div>
    </div>
    <form class="form-horizontal" role="form">
   
   <div class="form-group">
    <label for="usuario" class="col-lg-2 control-label">Usuario</label>
    <div class="col-lg-10">
      <input type="usuario" class="form-control" id="usuario" 
             placeholder="Tu nombre de usuario">
    </div>
  </div>
   <div class="form-group">
    <label for="passw" class="col-lg-2 control-label">Password</label>
    <div class="col-lg-10">
      <input type="passw" class="form-control" id="passw" 
             placeholder="Tu contrasena">
    </div>
  </div>
  
  <div class="form-group">
    <div class="col-lg-offset-2 col-lg-10">
     <a href="cuenta.jsp" class="btn btn-default" role="button">Ingresar</a>
    </div>
  </div>
</form>
  
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/bootshape.js"></script>
  </body>
</html>