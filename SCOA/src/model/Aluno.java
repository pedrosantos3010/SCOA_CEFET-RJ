package model;

import java.util.ArrayList;

import dao.AlunoDao;

public class Aluno {
	int id_aluno, periodo_aluno, id_usuario;
	String matricula_aluno;
	
	
	public Aluno(int periodo_aluno, int id_usuario) {
		super();
	
		this.periodo_aluno = periodo_aluno;
		this.id_usuario = id_usuario;
	
	}	
	
	public Aluno(){
		
	}
	
	public int getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}

	public int getPeriodo_aluno() {
		return periodo_aluno;
	}

	public void setPeriodo_aluno(int periodo_aluno) {
		this.periodo_aluno = periodo_aluno;
	}


	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getMatricula_aluno() {
		return matricula_aluno;
	}

	public void setMatricula_aluno(String matricula_aluno) {
		this.matricula_aluno = matricula_aluno;
	}

	public void cadastrar(Aluno aluno) throws Exception{
		new AlunoDao().cadastrarAluno(aluno);
	}	
	
	public void alterar(Aluno aluno) throws Exception{
		new AlunoDao().alterarAluno(aluno);
	}	
	
	public void excluir(int cod) throws Exception{
		new AlunoDao().excluirAluno(cod);
	}	
	
	public Aluno buscar(int cod) throws Exception{
		return new AlunoDao().buscarAluno(cod);
	}
	public ArrayList<String> listarAlunos() throws Exception{
		//return new AlunoDao().listaAlunos();
		return null;
	}
	}