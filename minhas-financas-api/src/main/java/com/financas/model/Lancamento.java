package com.financas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Lancamento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message =  "Campo obrigatorio!")
	private String descricao;
	
	@NotNull(message =  "Campo obrigatorio!")
	private Integer mes;
	
	@NotNull(message =  "Campo obrigatorio!")
	private Integer ano;
	
	@NotNull(message =  "Campo obrigatorio!")
	private BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	
	private LocalDate dataCadastro;
	
	
	
	

}
