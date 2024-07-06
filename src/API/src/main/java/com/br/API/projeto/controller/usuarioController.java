package com.br.API.projeto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.API.projeto.DAO.IUsuario;
import com.br.API.projeto.model.Usuario;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/usuarios")
public class usuarioController{
	
	@Autowired
	private IUsuario dao;
	
	@GetMapping
	public List<Usuario> listaUsuarios() {
		return (List<Usuario>) dao.findAll();
	}
	
	@PostMapping
	public Usuario criarUsuario (@RequestBody Usuario usuario) {
		Usuario usuarioNovo = dao.save(usuario);
		return usuarioNovo;
	}
	
	@PutMapping
	public Usuario alterarUsuario (@RequestBody Usuario usuario) {
		Usuario usuarioNovo = dao.save(usuario);
		return usuarioNovo;
	}
	
	@GetMapping("/{id}")
	public Optional<Usuario> listUsuario (@PathVariable Integer id) {
		Optional<Usuario> usuario = dao.findById(id);
		return usuario;
	}
	
	@DeleteMapping("/{id}")
	public Optional<Usuario> excluirUsuario (@PathVariable Integer id) {
		Optional<Usuario> usuario = dao.findById(id);
		dao.deleteById(id);
		return usuario;
	}
}
