<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.pguacm.app.modelos.Alumno" %>
    <%@page import="java.util.Date"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro Exitoso!</title>
</head>
<body>

	
	<h1 style="text-align: center; color: rebeccapurple; font-size: 30px;"> El Alumno se ha Registrado Correctamente!!!</h1>
		<% Alumno alumnoRecibidoServlet = (Alumno) request.getAttribute("alumnoRegistrado");
		out.print("<p>Código Java pero dentro etiquetas html</p>");
		out.print("<label>Nombre:</label>"+alumnoRecibidoServlet.getNombre());
		out.print("<br/>");
		Date fechaActual;
		%>	
	<span>Datos del alumno</span>
	<ul>
		<li>Matrícula: <%= alumnoRecibidoServlet.getMatricula() %></li>
		<li>Correo: <%= alumnoRecibidoServlet.getCorreo() %></li>
		<li>Apellido Paterno: <%= alumnoRecibidoServlet.getApP() %></li>
		<li>Apellido Materno: <%= alumnoRecibidoServlet.getApM() %></li>
		<li>Nombre: <%= alumnoRecibidoServlet.getNombre() %></li>
	</ul>
	<%
		fechaActual= new Date();
	%>
	<span>Fecha de inicio de sesión <%=fechaActual%></span>	
</body>
<footer style="text-align: center"><a href="index.html">Ya Puedes Ingresar...</a></footer>
</html>