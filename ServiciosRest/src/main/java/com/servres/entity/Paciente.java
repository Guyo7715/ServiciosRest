package com.servres.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Paciente {
	
	@Id
	private Long id;
	private Integer nro_documento;
	private String nombre;
	private String apellido;
	private Integer edad;
	private String genero;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNro_documento() {
		return nro_documento;
	}
	public void setNro_documento(Integer nro_documento) {
		this.nro_documento = nro_documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

}
