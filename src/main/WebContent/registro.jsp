<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro de Alumnos</title>
<link rel="stylesheet" href = "regStyle.css">
</head>
<body>
	
	 <section id="content" style = "text-align: center">
    <form action="registro" method="post">
      <h1 style = "text-align: center; color: rebeccapurple; font-size: 30px;"><b><i>Registro De Alumnos</i></b></h1>
      
      <div class="datosP">
        <input type="text" placeholder="nombre" id="username" name="username" />        
        <input type="text" placeholder="apellidoP" id="apellidoP" name="apellidoP" />        
        <input type="text" placeholder="apellidoM" id="apellidoM" name="apellidoM" />        
      </div>
      
      <div class="datosG">
        <input type="text" placeholder="anioDeNac" id="birthdate" name="birthdate" />
        <input type="text" placeholder="correo" id="correo" name="correo" />
        <input type="password" placeholder="password" required="" id="password" name="password" />
        <input type="password" placeholder="confirmarContraseña" required="" id="confPass" name="confPass" />
      </div>                                   
      
      <div class="datosEsc">
        <input type="text" placeholder="matricula" id="matricula" name="matricula" />
      </div>           
      
      <div class = "submitButton">
        <input type="submit" value="Registrar" />
      </div>      	
      <a href="index.html">Ya Tienes Cuenta?</a>
    </form><!-- form -->
    
  </section><!-- content -->	
</body>

</html>