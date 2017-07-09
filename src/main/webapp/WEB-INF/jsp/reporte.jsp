<!DOCTYPE html>
<html lang="en"><head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../favicon.ico">

        <title>Dashboard Template for Bootstrap</title>

        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <!-- Custom styles for this template -->
        <link href="css/dashboard.css" rel="stylesheet">


        <style type="text/css">
            :root #carbonads-container,
            :root #content > #right > .dose > .dosesingle,
            :root #content > #center > .dose > .dosesingle,
            :root .carbonad
            { display: none !important; };

        </style>

    </head>

    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Sistema de Peaje</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">

                        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Perfil<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="login2.ftl">Salir de Sesión</a></li>
                            </ul>
                        </li>
                        <li><a href="#">Help</a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-2 col-md-2 sidebar">
                    <ul class="nav nav-sidebar">
                        <li><a href="main2.ftl">Ingreso</a></li>
                        <li class="active"><a href="reporte.ftl">Reportes<span class="sr-only">(current)</span></a></li>
                </div>
                <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                    <h1 class="page-header">Consulta de dinero recaudado</h1>

                    <div class="row">
                        <div class="row">
                            <div class="col-md-4 col-md-offset-4">
                                <h3 class="sub-header text-center">Inserte una Fecha: </h3>
                                <form class="navbar-form navbar-left">
                                    <div class="form-group">
                                        <input type="date" class="form-control" placeholder="Cantidad">
                                    </div>
                                    <button type="submit" class="btn btn-primary form-control">Mostrar</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>

    </body>
</html>