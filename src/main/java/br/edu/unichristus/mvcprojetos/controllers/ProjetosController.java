package br.edu.unichristus.mvcprojetos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/projeto")
public class ProjetosController {

	@RequestMapping(value="/adicionar", method=RequestMethod.GET)
	// Exibe o formulário para adicionar um projeto
	public String adicionarProjeto() {
		System.out.println("Invocando o formulário via GET");
		return "adicionarProjeto";
	}
	
	@RequestMapping(value="/adicionar", method=RequestMethod.POST)
	// Salvar um projeto
	public String salvarProjeto() {
		System.out.println("Invocando o formulário via POST");
		return "adicionarProjeto";
	}
	
	@RequestMapping(value= "/adicionar", method=RequestMethod.POST, params={"tipo=multi"})
	public String salvarProjetoMultiplosAnos(){
		System.out.println("invocando salvar projeto múltiplos anos");
		return "adicionarProjeto";
	}
	
	@RequestMapping(value= "/adicionar", method=RequestMethod.POST, params={"tipo=multi", "especial"})
	public String salvarProjetoMultiplosAnosEspecial(){
		System.out.println("invocando salvar projeto múltiplos anos e especial");
		return "adicionarProjeto";
	}



}
