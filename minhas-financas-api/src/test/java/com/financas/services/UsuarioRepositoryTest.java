package com.financas.services;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.financas.model.Usuario;
import com.financas.repository.UsuarioRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UsuarioRepositoryTest {

	@Autowired
	UsuarioRepository repository;
	
	public void deveVerificarExistenciaDeUmEmail() {
		//cenário
		Usuario usuario = criarUsuario();
	}
	

	
	public static Usuario criarUsuario() {
		return Usuario 
	}
}
