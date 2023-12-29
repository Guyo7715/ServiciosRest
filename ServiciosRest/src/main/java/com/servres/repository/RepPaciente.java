package com.servres.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.servres.entity.PacienteDto;

@Repository
public interface RepPaciente extends JpaRepository<PacienteDto, Long> {
	
	@Query(value= "select pac.id, pac.nombre,pac.apellido from paciente pac join cita ct on pac.id=ct.id_paciente join medico md "
			+ "on md.id=ct.id_medico where ct.fecha = :fecha and ct.hora between :horaIn and :horaFin", nativeQuery = true)
	
	List<PacienteDto> consultaCitaPaciente(@Param("fecha") Date fecha, @Param("horaIn") String horaIn, @Param("horaFin") String horaFin);
	
}
