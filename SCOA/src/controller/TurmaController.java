package controller;

import java.sql.Time;
import java.util.ArrayList;

import model.Turma;

public class TurmaController {
	public boolean cadastrarTurma(int periodo, int numAlunos, int numAulas, int idProfessor, int idSala,
			int idGradeDisciplina, String nome, String turno, Time horaInicio, Time horaFim) throws Exception {
		if (periodo > 0 && numAlunos > 0 && numAulas > 0 && idProfessor > 0 && idSala > 0 && idGradeDisciplina > 0
				&& nome != null && nome.length() > 0 && turno != null && turno.length() > 0 && horaInicio != null
				&& horaFim != null) {
			Turma turma = new Turma(periodo, numAlunos, numAulas, idProfessor, idSala, idGradeDisciplina, nome, turno,
					horaInicio, horaFim);
			turma.cadastrar(turma);
			return true;
		}
		return false;
	}

	public boolean alterarTurma(int id, int periodo, int numAlunos, int numAulas, int idProfessor, int idSala,
			int idGradeDisciplina, String nome, String turno, Time horaInicio, Time horaFim) throws Exception {

		if (id > 0 && periodo > 0 && numAlunos > 0 && numAulas > 0 && idProfessor > 0 && idSala > 0
				&& idGradeDisciplina > 0 && nome != null && nome.length() > 0 && turno != null && turno.length() > 0
				&& horaInicio != null && horaFim != null) {
			Turma turma = new Turma(periodo, numAlunos, numAulas, idProfessor, idSala, idGradeDisciplina, nome, turno,
					horaInicio, horaFim);
			turma.setIdTurma(id);
			turma.alterar(turma);
			return true;
		}
		return false;
	}

	public boolean excluirTurma(int cod) throws Exception {

		if (cod > 0) {
			new Turma().excluir(cod);
			return true;
		}
		return false;
	}

	public ArrayList<Turma> listarTurmas(int idprofessor) throws Exception {
		return new Turma().listarTurmas(idprofessor);
	}

	public Turma buscarTurma(int cod) throws Exception {
		return new Turma().buscar(cod);
	}
}
