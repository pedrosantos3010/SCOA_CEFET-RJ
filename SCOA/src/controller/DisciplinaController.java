package controller;

import java.util.ArrayList;

import model.Disciplina;

public class DisciplinaController {
	public boolean cadastrarDisciplina(int id_curso, int periodo_disciplina, String nome_disciplina, String descricao_disciplina) throws Exception{		
		if (id_curso > 0 && periodo_disciplina > 0  && nome_disciplina != null && nome_disciplina.length() > 0 && 
				descricao_disciplina != null && descricao_disciplina.length() > 0){
			Disciplina disciplina = new Disciplina(id_curso, periodo_disciplina, nome_disciplina, descricao_disciplina);
			disciplina.cadastrar(disciplina);
			return true;
		} 
			return false;
	}	
	
public boolean alterarDisciplina(int id, int id_curso, int periodo_disciplina, String nome_disciplina, String descricao_disciplina) throws Exception{
		
		if (id > 0 && id_curso > 0 && periodo_disciplina > 0  && nome_disciplina != null && nome_disciplina.length() > 0 && 
				descricao_disciplina != null && descricao_disciplina.length() > 0){
			Disciplina disciplina = new Disciplina(id_curso, periodo_disciplina, nome_disciplina, descricao_disciplina);
			disciplina.alterar(disciplina);
			return true;
		} 
			return false;
	}
	
	public boolean excluirDisciplina(int cod) throws Exception {
		
		if (cod == 0){
			return false;
		}
		
		new Disciplina().excluir(cod);
		return true;
	}
	
	public ArrayList<String> listarDisciplinas() throws Exception{
		//return new Disciplina().listarDisciplinas();
		return null;
	}
}
