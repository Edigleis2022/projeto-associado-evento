package br.edu.ifmsnv.associadoeventos.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AssociadoRequest {
	@Size(max = 80, message = "Infome seu nome Completo")
	@NotBlank
	private String nome;
	
	@Size(max = 11, message = "Informe o seu CPF")
	@NotBlank
	private String cpf;
	
	@Size(max = 10, message = "Informe sua quadra e Lote")
	@NotBlank
	private String quadraLote;
	
	@Size(max = 15, message = "Infome seu telefone")
    @NotBlank
	private String telefone;
    
    @Size(max = 15, message = "Infome seu email")
    @NotBlank
	private String email;
    
    @Size(max = 10, message = "Infome sua senha")
    @NotBlank
    private String senha;
	
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getQuadraLote() {
		return quadraLote;
	}
	public void setQuadraLote(String quadraLote) {
		this.quadraLote = quadraLote;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		
		return getSenha();
	}

	
}
