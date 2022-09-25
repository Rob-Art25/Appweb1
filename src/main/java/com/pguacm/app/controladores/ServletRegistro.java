package com.pguacm.app.controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.pguacm.app.modelos.Alumno;
import com.pguacm.app.modelos.ServicioAlumnos;

/**
 * Servlet implementation class ServletRegistro
 */
public class ServletRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRegistro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cajaNombre = request.getParameter("username");
		String cajaApellidoP = request.getParameter("apellidoP");
		String cajaApellidoM = request.getParameter("apellidoM");
		String cajaAnioDeNac = request.getParameter("birthdate");
		String cajaCorreo = request.getParameter("correo");
		String cajaMatricula = request.getParameter("matricula");
		String cajaPassword = request.getParameter("password");
		String cajaConfPass = request.getParameter("confPass");
		
		ServicioAlumnos sa = new ServicioAlumnos();
		Alumno alumno = new Alumno(cajaNombre, Integer.parseInt(cajaAnioDeNac), cajaApellidoM, cajaApellidoP, cajaMatricula, cajaCorreo);
		sa.cargarListaAlumnos();					
		sa.registrarAlumno(alumno);
		request.setAttribute("alumnoRegistrado" , alumno);
		request.getRequestDispatcher("registroExitoso.jsp").forward(request, response);										
	}

}
