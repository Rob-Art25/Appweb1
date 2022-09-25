package com.pguacm.app.modelos;

public abstract class Persona {
	private String nombre;
	private int anioNac;
	private String apM;
	private String apP;
	public Persona(String nombre, int anioNac, String apM, String apP) {
		this.nombre = nombre;
		this.anioNac = anioNac;
		this.apM = apM;
		this.apP = apP;
	}
	
	public void tramitarIne() {
		System.out.println("Se realizo el tramite de INE");
	}
	public abstract int tramitarPasaporte(int anioActual);
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnioNac() {
		return anioNac;
	}
	public void setAnioNac(int anioNac) {
		this.anioNac = anioNac;
	}
	public String getApM() {
		return apM;
	}
	public void setApM(String apM) {
		this.apM = apM;
	}
	public String getApP() {
		return apP;
	}
	public void setApP(String apP) {
		this.apP = apP;
	}
	
	
	
}
