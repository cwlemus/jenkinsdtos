package com.home.dtos;

public class PersonaDto {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public PersonaDto(String nombre) {
		super();
		this.nombre = nombre;
	}
	
}
