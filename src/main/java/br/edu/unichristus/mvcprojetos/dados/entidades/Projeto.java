package br.edu.unichristus.mvcprojetos.dados.entidades;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "TB_PROJETOS")
public class Projeto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
