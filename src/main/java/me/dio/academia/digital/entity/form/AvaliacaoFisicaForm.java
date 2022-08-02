package me.dio.academia.digital.entity.form;

import java.util.Objects;

public class AvaliacaoFisicaForm {

	private Long alunoId;

	private double peso;

	private double altura;

	public AvaliacaoFisicaForm() {
	}

	public AvaliacaoFisicaForm(Long alunoId, double peso, double altura) {
		this.alunoId = alunoId;
		this.peso = peso;
		this.altura = altura;
	}

	public Long getAlunoId() {
		return alunoId;
	}

	public void setAlunoId(Long alunoId) {
		this.alunoId = alunoId;
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
		return Objects.hash(altura, alunoId, peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AvaliacaoFisicaForm other = (AvaliacaoFisicaForm) obj;
		return Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura)
				&& Objects.equals(alunoId, other.alunoId)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso);
	}

	@Override
	public String toString() {
		return "AvaliacaoFisicaForm [alunoId=" + alunoId + ", peso=" + peso + ", altura=" + altura + "]";
	}

}
