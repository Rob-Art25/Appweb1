package com.pguacm.app.controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.pguacm.app.modelos.Alumno;
import com.pguacm.app.modelos.ServicioAlumnos;

/**
 * Servlet implementation class ControladorServletForm
 */

public class ControladorServletForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorServletForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Petición por GET ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Se recibio petición por post ").append(" otro texto");
		String cajaCorreo = request.getParameter("username");
		
		
		ServicioAlumnos sa = new ServicioAlumnos();
		sa.cargarListaAlumnos();
		
		Alumno alumnoBuscado = sa.buscarAlumnoLista(cajaCorreo);
		
		if(alumnoBuscado != null)
		{
			request.setAttribute("alumno" , alumnoBuscado);
			request.getRequestDispatcher("respuestaPerfil.jsp").forward(request, response);
		}
		else
		{
			PrintWriter writer = response.getWriter();
			String htmlRespuesta = "<html>";
			htmlRespuesta = htmlRespuesta + "<h1 style = " + "color: red; font-size: 50px" + ">El Usuario o la contrasenia son incorrectos... </h2>";
			htmlRespuesta += "</html>";
			writer.println(htmlRespuesta);
		}
		
		
		
	}

}
