package com.financas.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Builder;

@Builder
@Entity
@Table(name = "usuario", schema = "financas")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty(message = "Campo obrigatorio!")
	private String nome;

	@NotEmpty(message = "Campo obrigatorio!")
	@Email
	private String email;

	@NotEmpty(message = "Campo obrigatorio!")
	private String senha;

	
	public Usuario() {
	}

	public Usuario(Integer id, @NotEmpty(message = "Campo obrigatorio!") String nome,
			@NotEmpty(message = "Campo obrigatorio!") @Email String email,
			@NotEmpty(message = "Campo obrigatorio!") String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + "]";
	}

	
	
	
	
	
	
}
