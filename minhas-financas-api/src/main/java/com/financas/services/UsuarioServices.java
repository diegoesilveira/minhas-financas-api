package com.financas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financas.model.Usuario;
import com.financas.repository.UsuarioRepository;
import com.financas.services.exceptions.RegraNegocioException;

@Service
public class UsuarioServices {
	
	@Autowired
	UsuarioRepository repository;

	public void validarEmail(String email) {
		boolean existe = repository.existsByEmail(email);
		if(existe) {
			throw new RegraNegocioException("Já existe um usuario cadastrado com esse e-mail.");
		}
	}
	
	public Usuario salvarUsuario(Usuario codigo) {
		return repository.save(codigo);
	}
	
		
	public Usuario autenticar(String email, String senha) {
		return null;
	}
	
	
}
