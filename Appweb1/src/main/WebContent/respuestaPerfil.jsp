<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.pguacm.app.modelos.Alumno" %>
    <%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Perfil de usuario</title>
</head>
<body>
	<h1>Aqui se mostrará el perfil de alumno encontrado</h1>
	<%  
	//esto es comentario java
		Alumno alumnoRecibidoServlet = (Alumno) request.getAttribute("alumno");
		out.print("<p>Código Java pero dentro etiquetas html</p>");
		out.print("<label>Nombre:</label>"+alumnoRecibidoServlet.getNombre());
		out.print("<br/>");
		Date fechaActual;
	%>
	<span>Datos del alumno</span>
	<ul>
		<li>Matrícula: <%= alumnoRecibidoServlet.getMatricula() %></li>
		<li></li>
		<li></li>
	</ul>
	<p>Este p está fuera del código Java </p>
	<%
	fechaActual= new Date();
	%>
	<span>Fecha de inicio de sesión <%=fechaActual%></span>
</body>
</html>