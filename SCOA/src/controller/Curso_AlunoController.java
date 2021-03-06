package controller;

import java.sql.Date;
import java.util.ArrayList;

import model.Curso_Aluno;

public class Curso_AlunoController {
	
public boolean cadastrarCurso_Aluno(int curso, int aluno, String matricula, int status, Date data) throws Exception{		
		if (curso > 0 && aluno > 0 && matricula.length() > 0 && matricula != null && status > 0){
			Curso_Aluno cursoAluno = new Curso_Aluno(curso,aluno,matricula,status,data);
			cursoAluno.cadastrar(cursoAluno);
			return true;
		} 
			return false;
	}	
	
public boolean alterarCurso_Aluno(int curso_aluno, int curso, int aluno, String matricula, int status, Date data) throws Exception{
		
		if (curso_aluno > 0 && curso > 0 && aluno > 0 && matricula.length() > 0 && matricula != null && status > 0){
			Curso_Aluno cursoAluno = new Curso_Aluno(curso,aluno,matricula,status,data);
			cursoAluno.setId_curso_aluno(curso_aluno);
			cursoAluno.alterar(cursoAluno);
			return true;
		} 
			return false;
	}
	
	public boolean excluirCurso_Aluno(int cod) throws Exception {
		
		if (cod == 0){
			new Curso_Aluno().excluir(cod);
			return true;
			
		}
			return false;
		
	}
	
	public ArrayList<Curso_Aluno> listarCurso_Alunos() throws Exception{
		return new Curso_Aluno().listar();
		
	}
	
	public ArrayList<Curso_Aluno> listarCurso_Alunos(int idaluno) throws Exception{
		return new Curso_Aluno().listar(idaluno);
		
	}
	
	public Curso_Aluno buscarCurso_Aluno(int id) throws Exception{
		return new Curso_Aluno().buscar(id);
		
	}

}
