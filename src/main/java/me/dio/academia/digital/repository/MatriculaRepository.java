package me.dio.academia.digital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import me.dio.academia.digital.entity.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
	/**
	 *
	 * @param bairro bairro referência para o filtro
	 * @return lista de alunos matriculados que residem no bairro passado como
	 *         parâmetro
	 */
	@Query(value = "SELECT * FROM tb_matriculas m " + "INNER JOIN tb_alunos a ON m.aluno_id = a.id "
			+ "WHERE a.bairro = :bairro", nativeQuery = true)
	//
	List<Matricula> findAlunosMatriculadosBairro(String bairro);
}
