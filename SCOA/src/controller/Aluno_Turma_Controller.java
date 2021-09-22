package controller;

import java.util.ArrayList;
import java.sql.Date;

import model.Aluno_Turma;

public class Aluno_Turma_Controller {
	
public boolean cadastrarAluno_Turma(int idTurma,int idAluno,float freq, float media, String status, Date data) throws Exception{		
		if (idTurma > 0 && idAluno > 0 && status.length() > 0 && status != null && data !=null ){
			Aluno_Turma alunoTurma = new Aluno_Turma(idTurma,idAluno,freq,media,status,data);
			alunoTurma.cadastrar(alunoTurma);
			return true;
		} 
			return false;
	}	
	
public boolean alterarAluno_Turma(int idAT, int idTurma,int idAluno,float freq, float media, String status, Date data) throws Exception{
		
		if (idAT > 0 && idTurma > 0 && idAluno > 0 && status.length() > 0 && status != null && data !=null ){
			Aluno_Turma alunoTurma = new Aluno_Turma(idTurma,idAluno,freq,media,status,data);
			alunoTurma.setId_status_aluno_turma(idAT);
			alunoTurma.alterar(alunoTurma);
			return true;
		} 
			return false;
	}
	
	public boolean excluirAluno_Turma(int cod) throws Exception {
		
		if (cod == 0){
			return false;
		}
		
		//new AtorDao().excluirAtor(cod);
			return true;
	}
	
	public ArrayList<String> listar() throws Exception{
		//return new Ator().listarAtores();
		return null;
	}

}
