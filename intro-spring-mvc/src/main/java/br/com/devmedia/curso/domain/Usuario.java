package br.com.devmedia.curso.domain;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Usuario {
	
	private Long id;
	
	@NotBlank
	@Size(min=3, max=50)
	private String nome;
	
	@NotBlank
	@Size(min=3, max=50)
	private String sobrenome;
	
	@NotNull
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate nascimento;
	
	private TipoSexo sexo;
	
	
	public Usuario(Long id, String nome, String sobrenome) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public Usuario(Long id, String nome, String sobrenome, LocalDate nascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nascimento = nascimento;
	}	

	public Usuario(Long id, String nome, String sobrenome, LocalDate nascimento, TipoSexo sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nascimento = nascimento;
		this.sexo = sexo;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	
	public TipoSexo getSexo() {
		return sexo;
	}

	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + "]";
	}
	
}
