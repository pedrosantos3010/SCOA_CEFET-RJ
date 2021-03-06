package controller;

import java.util.ArrayList;

import model.Disciplina;

public class DisciplinaController {
	public boolean cadastrarDisciplina(int periodo, String nome, String descricao) throws Exception {
		if (periodo > 0 && nome != null && nome.length() > 0 && descricao != null && descricao.length() > 0) {
			Disciplina disciplina = new Disciplina(periodo, nome, descricao);
			disciplina.cadastrar(disciplina);
			return true;
		}
		return false;
	}

	public boolean alterarDisciplina(int id, int periodo, String nome, String descricao) throws Exception {

		if (id > 0 && periodo > 0 && nome != null && nome.length() > 0 && descricao != null && descricao.length() > 0) {
			Disciplina disciplina = new Disciplina(periodo, nome, descricao);
			disciplina.setIdDisciplina(id);
			disciplina.alterar(disciplina);
			return true;
		}
		return false;
	}

	public boolean excluirDisciplina(int cod) throws Exception {

		if (cod > 0) {
			new Disciplina().excluir(cod);
			return true;
		}
		return false;
	}

	public ArrayList<Disciplina> listarDisciplinas() throws Exception {
		return new Disciplina().listarDisciplinas();
	}

	public Disciplina buscarDisciplina(int cod) throws Exception {
		return new Disciplina().buscar(cod);
	}
}
