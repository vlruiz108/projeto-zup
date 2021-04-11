package com.projetozup.validadordecadastro.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetozup.validadordecadastro.model.Paciente;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
	
	@GetMapping
	public List<Paciente> listar() {
		
	}

}
