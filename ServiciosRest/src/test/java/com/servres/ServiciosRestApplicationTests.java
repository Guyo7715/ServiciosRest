package com.servres;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.servres.services.PacienteService;

@SpringBootTest
class ServiciosRestApplicationTests {
	
	@Autowired
	PacienteService pacienteService;
	
	@Test
	void pruebasUnitaria() {
		pacienteService.consultarMedicinaPaciente(456123);
		assertTrue(true);
	}
	
	@Test
	void pruebasUnitariaHoar() throws ParseException {
		SimpleDateFormat fechaIn = new SimpleDateFormat("yyyy-MM-dd");
		java.sql.Date fechaInc = null;
		Date fechaEntrada = fechaIn.parse("2023-12-28");
		fechaInc = new java.sql.Date(fechaEntrada.getTime());
		pacienteService.consultarPacienteMedico(fechaInc, "15:00", "18:00");
		assertTrue(true);
	}

	@Test
	void contextLoads() {
		
		
	}

}
