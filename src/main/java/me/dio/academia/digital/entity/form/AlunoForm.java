package me.dio.academia.digital.entity.form;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

public class AlunoForm {

	@NotEmpty(message = "Preencha o campo corretamente.")
	@Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
	private String nome;

	@NotEmpty(message = "Preencha o campo corretamente.")
	//@CPF(message = "'${validatedValue}' é inválido!")
	private String cpf;

	@NotEmpty(message = "Preencha o campo corretamente.")
	@Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
	private String bairro;

	@NotNull(message = "Prencha o campo corretamente.")
	@Past(message = "Data '${validatedValue}' é inválida.")
	private LocalDate dataDeNascimento;

	public AlunoForm() {
	}

	public AlunoForm(String nome, String cpf, String bairro, LocalDate dataDeNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.bairro = bairro;
		this.dataDeNascimento = dataDeNascimento;
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

	@Override
	public int hashCode() {
		return Objects.hash(bairro, cpf, dataDeNascimento, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunoForm other = (AlunoForm) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(dataDeNascimento, other.dataDeNascimento) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "AlunoForm [nome=" + nome + ", cpf=" + cpf + ", bairro=" + bairro + ", dataDeNascimento="
				+ dataDeNascimento + "]";
	}

}
