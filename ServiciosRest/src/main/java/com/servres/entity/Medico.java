package com.servres.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Medico {
	
	@Id
	private Long id;
	private Integer numero_licencia;
	private String nombre;
	private String apellido;
	private String especialidad;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNumero_licencia() {
		return numero_licencia;
	}
	public void setNumero_licencia(Integer numero_licencia) {
		this.numero_licencia = numero_licencia;
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
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	

}
