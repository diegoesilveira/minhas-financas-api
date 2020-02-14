package com.financas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financas.model.Usuario;
import com.financas.repository.UsuarioRepository;
import com.financas.services.exceptions.ErrorAutenticacao;
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
	
	public Usuario salvarUsuario(Usuario usuario) {
		validarEmail(usuario.);
		return repository.save(usuario);
	}
	
		
	public Usuario autenticar(String email, String senha) {
		Optional<Usuario> usuario = repository.findByEmail(email);
		
		if(!usuario.isPresent()) {
			throw new ErrorAutenticacao("Usuario não encontrado para o email informado!");
		}
		
		if(usuario.get().getSenha().equals(senha)) {
			throw new ErrorAutenticacao("Senha invalida!");
		}
		
		return usuario.get();
	}
	
	
}
