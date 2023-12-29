package com.servres.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servres.entity.Medicina;
import com.servres.entity.Paciente;
import com.servres.entity.PacienteDto;
import com.servres.impServices.IServicioPaciente;
import com.servres.repository.RepMedicina;
import com.servres.repository.RepPaciente;

@Service
public class PacienteService implements IServicioPaciente {
	
	@Autowired
	RepMedicina repMedicina;
	
	@Autowired
	RepPaciente repPaciente;

	@Override
	public List<Medicina> consultarMedicinaPaciente(Integer nro_documento) {
		List<Medicina> listaMedicina = repMedicina.consultaMedicina(nro_documento);
		return listaMedicina;
	}

	@Override
	public List<PacienteDto> consultarPacienteMedico(Date fechaInc, String horaIn, String horaFin) {
		List<PacienteDto> listaPacienteMedico = repPaciente.consultaCitaPaciente(fechaInc, horaIn, horaFin);
		return listaPacienteMedico;
	}
	
	

}
