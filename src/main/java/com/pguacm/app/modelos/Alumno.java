package com.pguacm.app.modelos;

public class Alumno extends Persona{
	private String matricula;
	private String correo;
	
	public Alumno(String nombre, int anioNac, String apM, String apP, String matricula,String correo) {
		super(nombre, anioNac, apM, apP);
		this.matricula=matricula;
		this.correo=correo;		
	}	

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}


	@Override
	public int tramitarPasaporte(int anioActual) {
		System.out.println("ALUMNO Se tramito pasaporte");
		return -1;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
