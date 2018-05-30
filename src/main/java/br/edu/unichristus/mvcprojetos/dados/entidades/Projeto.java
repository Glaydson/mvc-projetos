package br.edu.unichristus.mvcprojetos.dados.entidades;

import java.math.BigDecimal;

import lombok.Data;
@Data
public class Projeto {
	private Long idProjeto;

	private String nome;

	private String descricao;

	private String patrocinador;

	private BigDecimal horasAutorizadas;

	private BigDecimal fundosAutorizados;

	private String ano;

	private boolean especial;

	private String tipo;

	// Getters e Setters

}
