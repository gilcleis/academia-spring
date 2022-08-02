package me.dio.academia.digital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_matriculas")
public class Matricula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aluno_id")
	private Aluno aluno;

	private LocalDateTime dataDaMatricula = LocalDateTime.now();

	public Matricula(Long id, Aluno aluno, LocalDateTime dataDaMatricula) {
		this.id = id;
		this.aluno = aluno;
		this.dataDaMatricula = dataDaMatricula;
	}

	public Matricula() {

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

	public LocalDateTime getDataDaMatricula() {
		return dataDaMatricula;
	}

	public void setDataDaMatricula(LocalDateTime dataDaMatricula) {
		this.dataDaMatricula = dataDaMatricula;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aluno, dataDaMatricula, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matricula other = (Matricula) obj;
		return Objects.equals(aluno, other.aluno) && Objects.equals(dataDaMatricula, other.dataDaMatricula)
				&& Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Matricula [id=" + id + ", aluno=" + aluno + ", dataDaMatricula=" + dataDaMatricula + "]";
	}

}
