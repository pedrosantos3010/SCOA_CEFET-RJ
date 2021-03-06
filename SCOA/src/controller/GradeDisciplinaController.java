package controller;

import java.util.ArrayList;

import model.GradeDisciplina;

public class GradeDisciplinaController {
	public boolean cadastrarGradeDisciplina(int idDisciplina, int idGrade) throws Exception {
		if (idDisciplina > 0 && idGrade > 0) {
			GradeDisciplina gradedisciplina = new GradeDisciplina(idDisciplina, idGrade);
			gradedisciplina.cadastrar(gradedisciplina);
			return true;
		}
		return false;
	}

	public boolean alterarGradeDisciplina(int id, int idDisciplina, int idGrade) throws Exception {

		if (id > 0 && idDisciplina > 0 && idGrade > 0) {
			GradeDisciplina gradedisciplina = new GradeDisciplina(idDisciplina, idGrade);
			gradedisciplina.setIdGradeDisciplina(id);
			gradedisciplina.alterar(gradedisciplina);
			return true;
		}
		return false;
	}

	public boolean excluirGradeDisciplina(int cod) throws Exception {

		if (cod > 0) {
			new GradeDisciplina().excluir(cod);
			return true;
		}
		return false;
	}

	public ArrayList<GradeDisciplina> listarGradesDisciplinas(int idgrade) throws Exception {
		return new GradeDisciplina().listar(idgrade);
	}
	
	public ArrayList<GradeDisciplina> listarGradesDisciplinas() throws Exception {
		return new GradeDisciplina().listar();
	}

	public GradeDisciplina buscarGradeDisciplina(int cod) throws Exception {
		return new GradeDisciplina().buscar(cod);
	}
}
