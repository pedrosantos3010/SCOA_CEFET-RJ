package controller;

import java.util.ArrayList;

import model.Curso;

public class CursoController {
	public boolean cadastrarCurso(int periodos, String nome_curso, String tipo_curso, String descricao_curso)
			throws Exception {
		if (periodos > 0 && nome_curso != null && nome_curso.length() > 0 && tipo_curso != null
				&& tipo_curso.length() > 0 && descricao_curso != null && descricao_curso.length() > 0) {
			Curso curso = new Curso(periodos, nome_curso, tipo_curso, descricao_curso);
			curso.cadastrar(curso);
			return true;
		}
		return false;
	}

	public boolean alterarCurso(int id, int periodos, String nome_curso, String tipo_curso, String descricao_curso)
			throws Exception {

		if (id > 0 && periodos > 0 && nome_curso != null && nome_curso.length() > 0 && tipo_curso != null
				&& tipo_curso.length() > 0 && descricao_curso != null && descricao_curso.length() > 0) {
			Curso curso = new Curso(periodos, nome_curso, tipo_curso, descricao_curso);
			curso.cadastrar(curso);
			return true;
		}
		return false;
	}

	public boolean excluirCurso(int cod) throws Exception {

		if (cod == 0) {
			return false;
		}

		new Curso().excluir(cod);
		return true;
	}

	public ArrayList<Curso> listarCursos() throws Exception {
		return new Curso().listarCurso();
	}

	public Curso buscarCurso(int cod) throws Exception {
		return new Curso().buscar(cod);

	}
}