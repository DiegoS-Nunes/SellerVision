package com.br.API.projeto.model;
import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="nome", length = 200, nullable = true)
	private String nome;
	
	@Column(name="username", length = 200, nullable = false)
	private String username;
	
	@Column(name="email", length = 200, nullable = false)
	private String email;
	
	@Column(name="telefone", length = 15, nullable = false)
	private String telefone;
	
	@Column(name="senha", columnDefinition = "TEXT", nullable = false)
	private String senha;
	
	@Column(name="dataCadastro", columnDefinition = "date", nullable = false)
	private Date dataCadastro;
	
	public Usuario() {
        this.dataCadastro = Date.valueOf(LocalDate.now());
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}
