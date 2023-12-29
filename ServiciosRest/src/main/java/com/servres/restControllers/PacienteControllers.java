package com.servres.restControllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servres.entity.Medicina;
import com.servres.entity.Paciente;
import com.servres.entity.PacienteDto;
import com.servres.impServices.IServicioPaciente;

@RestController
@RequestMapping("/api")
public class PacienteControllers {
	
	@Autowired
	IServicioPaciente iServicioPaciente;
	
	
	@GetMapping("/consultaMedicinas/{nro_documento}")
	public List<Medicina> consultaMedicina(@PathVariable Integer nro_documento) {
		List<Medicina> consultaMedicina = iServicioPaciente.consultarMedicinaPaciente(nro_documento);
		return consultaMedicina;
	}
	
	@GetMapping("/consultarPacientes/{fecha}/{horaIn}/{horaFin}")
	public List<PacienteDto> consultarPaciente(@PathVariable String fecha, @PathVariable String horaIn, @PathVariable String horaFin) throws ParseException {
		SimpleDateFormat fechaIn = new SimpleDateFormat("yyyy-MM-dd");
		java.sql.Date fechaInc = null;
		Date fechaEntrada = fechaIn.parse(fecha);
		fechaInc = new java.sql.Date(fechaEntrada.getTime());
		List<PacienteDto> listaPaciente= iServicioPaciente.consultarPacienteMedico(fechaInc, horaIn, horaFin);
		return listaPaciente;
		
		
		
	}
	
	

}
