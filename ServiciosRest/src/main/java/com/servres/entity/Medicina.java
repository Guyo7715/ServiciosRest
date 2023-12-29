package com.servres.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Medicina {
	
	@Id
	private Long id;
	private Integer id_cita;
	private Integer numero_lote;
	private String nombre_medicina;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getId_cita() {
		return id_cita;
	}
	public void setId_cita(Integer id_cita) {
		this.id_cita = id_cita;
	}
	public Integer getNumero_lote() {
		return numero_lote;
	}
	public void setNumero_lote(Integer numero_lote) {
		this.numero_lote = numero_lote;
	}
	public String getNombre_medicina() {
		return nombre_medicina;
	}
	public void setNombre_medicina(String nombre_medicina) {
		this.nombre_medicina = nombre_medicina;
	}

}
