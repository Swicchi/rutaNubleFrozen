
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
   <body onload="document.f.j_username.focus();">
        <div id="loginbox">            
            <form name="f" id="loginform" method="POST" class="form-vertical" action="main2.ftl">
				 <div class="control-group normal_text"> <h3>Acceso Empleados: Ingreso</h3></div>
                <div class="control-group">
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_lg"><i class="icon-user"> </i></span><input type="email" placeholder="Email_Usuario" required id="username" name="j_username" />
                        </div>
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_ly"><i class="icon-lock"></i></span><input type="password" placeholder="Clave_Usuario" required id="password" name="j_password"/>
                        </div>
                    </div>
                </div>
                <div class="form-actions">
                    
                     <span class="pull-right">
                           <input type="hidden" name="action" value="login_user"/>
                        <input type="submit" class="btn btn-success" value="Ingresar"/></span>
                            <!--<input type="hidden" name="action" value="login_user"/><a type="submit"  class="btn btn-success" /> Ingresar</a>-->
                         <span class="pull-left">   <input class="flip-link btn btn-success" name="reset" type="reset"></span>
<!--                      <a type = "reset"  id="to-login">&laquo;Limpiar</a> -->
                </div>
            </form>
            
        </div>
        
        <script src="plugins/js/jquery.min.js"></script>  
        <script src="plugins/js/matrix.login.js"></script> 
    </body>

</html>