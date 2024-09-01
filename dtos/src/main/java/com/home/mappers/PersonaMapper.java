package com.home.mappers;

import com.home.dtos.PersonaDto;
import com.home.models.Persona;

public class PersonaMapper {
	public static PersonaDto toDto(Persona persona) {
		return new PersonaDto(persona.getNombre().toUpperCase());
	}
	
	public static Persona toBo(PersonaDto personaDto) {
		return new Persona(personaDto.getNombre().toUpperCase());
	}
}
