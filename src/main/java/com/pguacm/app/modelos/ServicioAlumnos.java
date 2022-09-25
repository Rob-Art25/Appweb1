package com.pguacm.app.modelos;

import java.util.ArrayList;
import java.util.List;

public class ServicioAlumnos {
	
	public static List<Alumno> listaAlumnos;
	
	public ServicioAlumnos() {
		
	}
	
	public void cargarListaAlumnos() {
		listaAlumnos = new ArrayList<>();
		Alumno a1= new Alumno("Jose Jose", 1950, "Benitez", "Malvaez","112233","josejose@gmail.com");
		Alumno a2= new Alumno("Paquita", 1970, "Luciana", "Exploradora","334455","exploradora@gmail.com");
		listaAlumnos.add(a1);
		listaAlumnos.add(a2);
	}
	
	public Alumno buscarAlumnoLista(String correo) {
		for(Alumno a: listaAlumnos) {
			if(a.getCorreo().equals(correo)) 
			{
				return a;
			}
		}
		return null;
	
	}
	
	public void registrarAlumno(Alumno alumno)
	{
		listaAlumnos.add(alumno);
	}

}
