package com.servres.impServices;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.servres.entity.Medicina;
import com.servres.entity.Paciente;
import com.servres.entity.PacienteDto;

@Component
public interface IServicioPaciente {
	
	public List<Medicina> consultarMedicinaPaciente(Integer nro_documento );
	
	public List<PacienteDto> consultarPacienteMedico(Date fechaInc , String horaIn, String horaFin );

}
