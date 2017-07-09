<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
    
<head>
        <title>Acceso Sistema</title><meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="plugins/css/bootstrap.min.css" />
		<link rel="stylesheet" href="plugins/css/bootstrap-responsive.min.css" />
        <link rel="stylesheet" href="plugins/css/matrix-login.css" />
        <link href="plugins/font-awesome/css/font-awesome.css" rel="stylesheet" />
		<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>

    </head>
   <body >
        <div id="loginbox">            
      <!--       <form  id="loginform" method="POST" class="form-vertical" action="main.ftl"> -->
      <c:if test="${noUsuario}">
      		<span class="btn btn-danger btn-sm popover-error">El correo no se encuentra registrado </span>
   	</c:if>
   	<c:if test="${contraseñaIncorrecta}">
      		<span class="btn btn-danger btn-sm popover-error">Contraseña incorrecta </span>
   	</c:if>
            <form:form method="post" commandName="UserViewModel" action="/cajero/login">	
             <div class="control-group normal_text"> <h3>Acceso Empleados: Ingreso</h3></div>
                <div class="control-group">
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_lg"><i class="icon-user"> </i></span><form:input type="text" class="form-control" path="correo" placeholder="Ingrese su email"/>
                            <form:errors path="correo" cssClass="btn btn-danger btn-sm popover-error" />
                        </div>
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_ly"><i class="icon-lock"></i></span><<form:password	class="form-control" path="clave"  placeholder="Ingrese su clave"/> 
                        	<form:errors path="clave" cssClass="btn btn-danger btn-sm popover-error" />
                        </div>
                    </div>
                </div>
                <div class="form-actions">
                    
                     <span class="pull-right">
                        <input type="submit" class="btn btn-success" value="Ingresar"/></span>
                            <!--<input type="hidden" name="action" value="login_user"/><a type="submit"  class="btn btn-success" /> Ingresar</a>-->
                         <span class="pull-left">   <input class="flip-link btn btn-success" name="reset" type="reset"></span>
<!--                      <a type = "reset"  id="to-login">&laquo;Limpiar</a> -->
                </div>
          </form:form>
            
        </div>
        
        <script src="plugins/js/jquery.min.js"></script>  
        <script src="plugins/js/matrix.login.js"></script> 
    </body>

</html>