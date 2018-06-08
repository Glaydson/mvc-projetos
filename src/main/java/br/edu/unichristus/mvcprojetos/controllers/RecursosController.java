package br.edu.unichristus.mvcprojetos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/recurso")
public class RecursosController {
	
	@RequestMapping(value = "/adicionar", method=RequestMethod.GET)
	public String exibirFormularioRecurso() {
		return "adicionarRecurso";
	}
	
	@RequestMapping(value = "/adicionar", method=RequestMethod.POST)
	public String salvar() {
		return "adicionarRecurso";
	}

}
