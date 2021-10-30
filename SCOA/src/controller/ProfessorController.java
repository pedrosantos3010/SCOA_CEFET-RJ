package controller;

import java.util.ArrayList;

import model.Professor;

public class ProfessorController {
	public boolean cadastrarProfessor(int id_usuario, String descricao_academica, String matricula) throws Exception{		
		if (id_usuario > 0 && descricao_academica != null && descricao_academica.length() > 0 && matricula != null && matricula.length() > 0){
			Professor professor = new Professor(id_usuario, descricao_academica,matricula);
			professor.cadastrar(professor);
			return true;
		} 
			return false;
	}	
	
public boolean alterarProfessor(int id, int id_usuario, String descricao_academica, String matricula) throws Exception{
		
		if (id > 0 && id_usuario > 0 && descricao_academica != null && descricao_academica.length() > 0  && matricula != null && matricula.length() > 0){
			Professor professor = new Professor(id_usuario, descricao_academica, matricula);
			professor.alterar(professor);
			return true;
		} 
			return false;
	}
	
	public boolean excluirProfessor(int cod) throws Exception {
		
		if (cod == 0){
			return false;
		}
		
		new Professor().excluir(cod);
			return true;
	}
	
	public ArrayList<Professor> listarProfessores() throws Exception{
		return new Professor().listarProfessores();
		
	}
}
