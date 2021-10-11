package controller;

import java.util.ArrayList;

import model.Aluno;

public class AlunoController {
	public boolean cadastrarAluno(int periodo, int id_curso, int id_usuario, String matricula) throws Exception{		
		if (periodo > 0 && id_curso >0 && id_usuario > 0 && matricula != null && matricula.length() > 0){
			Aluno aluno = new Aluno(periodo, id_curso, id_usuario, matricula);
			aluno.cadastrar(aluno);
			return true;
		} 
			return false;
	}	
	
public boolean alterarAluno(int id, int periodo, int id_curso, int id_usuario, String matricula) throws Exception{
		
		if (id > 0 && periodo > 0 && id_curso >0 && id_usuario > 0 && matricula != null && matricula.length() > 0){
			Aluno aluno = new Aluno(periodo, id_curso, id_usuario, matricula);
			aluno.alterar(aluno);
			return true;
		} 
			return false;
	}
	
	public boolean excluirAluno(int cod) throws Exception {
		
		if (cod == 0){
			return false;
		}
		new Aluno().excluir(cod);
		return true;
	}
	
	public ArrayList<String> listarAlunos() throws Exception{
		//return new Aluno().listarAlunos();
		return null;
	}
}