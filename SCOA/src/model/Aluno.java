package model;

import java.util.ArrayList;

public class Aluno {
	int id_aluno, periodo_aluno, id_curso, id_usuario;
	String matricula_aluno;
	
	
	public Aluno(int periodo_aluno, int id_curso, int id_usuario, String matricula_aluno) {
		super();
	
		this.periodo_aluno = periodo_aluno;
		this.id_curso = id_curso;
		this.id_usuario = id_usuario;
		this.matricula_aluno = matricula_aluno;
	}
	
	public void cadastrar(Aluno aluno) throws Exception{
		//new Dao().cadastrar(aluno);
	}	
	
	public void alterar(Aluno aluno) throws Exception{
		//new Dao().alterar(obj);
	}	
	
	public void excluir(int cod) throws Exception{
		//new Dao().excluir(cod);
	}	
	
	public void buscar(int cod) throws Exception{
		//new Dao().buscar(cod)
	}
	public ArrayList<String> listarAtores() throws Exception{
		//return new Dao().listar();
		return null;
	}
	}