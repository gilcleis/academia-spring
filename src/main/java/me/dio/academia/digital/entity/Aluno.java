package me.dio.academia.digital.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "tb_alunos")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	@Column(unique = true)
	private String cpf;

	private String bairro;

	private LocalDate dataDeNascimento;

	@OneToMany(mappedBy = "aluno", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

	public Aluno() {
	}

	public Aluno(Long id, String nome, String cpf, String bairro, LocalDate dataDeNascimento,
			List<AvaliacaoFisica> avaliacoes) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.bairro = bairro;
		this.dataDeNascimento = dataDeNascimento;
		this.avaliacoes = avaliacoes;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public List<AvaliacaoFisica> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<AvaliacaoFisica> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(avaliacoes, bairro, cpf, dataDeNascimento, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(avaliacoes, other.avaliacoes) && Objects.equals(bairro, other.bairro)
				&& Objects.equals(cpf, other.cpf) && Objects.equals(dataDeNascimento, other.dataDeNascimento)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", bairro=" + bairro + ", dataDeNascimento="
				+ dataDeNascimento + ", avaliacoes=" + avaliacoes + "]";
	}
	
	

}
