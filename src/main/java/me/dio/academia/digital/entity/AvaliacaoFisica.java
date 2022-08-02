package me.dio.academia.digital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;


@Entity
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "aluno_id")
	private Aluno aluno;

	private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

	@Column(name = "peso_atual")
	private double peso;

	@Column(name = "altura_atual")
	private double altura;
	
	

	public AvaliacaoFisica() {
	}

	public AvaliacaoFisica(Long id, Aluno aluno, LocalDateTime dataDaAvaliacao, double peso, double altura) {
		this.id = id;
		this.aluno = aluno;
		this.dataDaAvaliacao = dataDaAvaliacao;
		this.peso = peso;
		this.altura = altura;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public LocalDateTime getDataDaAvaliacao() {
		return dataDaAvaliacao;
	}

	public void setDataDaAvaliacao(LocalDateTime dataDaAvaliacao) {
		this.dataDaAvaliacao = dataDaAvaliacao;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public int hashCode() {
		return Objects.hash(altura, aluno, dataDaAvaliacao, id, peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AvaliacaoFisica other = (AvaliacaoFisica) obj;
		return Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura)
				&& Objects.equals(aluno, other.aluno) && Objects.equals(dataDaAvaliacao, other.dataDaAvaliacao)
				&& Objects.equals(id, other.id) && Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso);
	}

	@Override
	public String toString() {
		return "AvaliacaoFisica [id=" + id + ", aluno=" + aluno + ", dataDaAvaliacao=" + dataDaAvaliacao + ", peso="
				+ peso + ", altura=" + altura + "]";
	}
	
	

}
