package model;

import java.util.ArrayList;

public class Professor{
	int id_professor, id_usuario;
	String descricao_academca;
	
	
	public Professor(int id_professor, int id_usuario, String descricao_academca) {
		super();
		this.id_professor = id_professor;
		this.id_usuario = id_usuario;
		this.descricao_academca = descricao_academca;
	}
	
	public int getId_professor() {
		return id_professor;
	}

	public void setId_professor(int id_professor) {
		this.id_professor = id_professor;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getDescricao_academca() {
		return descricao_academca;
	}

	public void setDescricao_academca(String descricao_academca) {
		this.descricao_academca = descricao_academca;
	}

	public void cadastrar(Professor professor) throws Exception{
		//new ProfessorDao().cadastrarProfessor(professor);
	}	
	
	public void alterar() throws Exception{
		//new ProfessorDao().alterarProfessor(professor);
	}	
	
	public void excluir(int cod) throws Exception{
		//new ProfessorDao().excluirProfessor(cod);
	}	
	
	public void buscar(int cod) throws Exception{
		//new ProfessorDao().buscarProfessor(cod)
	}
	public ArrayList<String> listarAtores() throws Exception{
		//return new ProfessorDao().listarProfessor();
		return null;
	}
}