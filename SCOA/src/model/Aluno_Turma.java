package model;

import java.util.ArrayList;

public class Aluno_Turma{
	public int getId_status_aluno_turma() {
		return id_status_aluno_turma;
	}


	public void setId_status_aluno_turma(int id_status_aluno_turma) {
		this.id_status_aluno_turma = id_status_aluno_turma;
	}
	int id_status_aluno_turma, id_turma, id_aluno; 
	float frequencia,	media;
	String status_aluno;
	String data_encerramento;
	
	public Aluno_Turma(int id_turma, int id_aluno, float frequencia, float media,
			String status_aluno, String data_encerramento) {
		super();
		this.id_turma = id_turma;
		this.id_aluno = id_aluno;
		this.frequencia = frequencia;
		this.media = media;
		this.status_aluno = status_aluno;
		this.data_encerramento = data_encerramento;
	}

	public Aluno_Turma() {

	}


	public int getId_turma() {
		return id_turma;
	}

	public void setId_turma(int id_turma) {
		this.id_turma = id_turma;
	}

	public int getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}

	public float getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(float frequencia) {
		this.frequencia = frequencia;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	public String getStatus_aluno() {
		return status_aluno;
	}

	public void setStatus_aluno(String status_aluno) {
		this.status_aluno = status_aluno;
	}

	public String getData_encerramento() {
		return data_encerramento;
	}

	public void setData_encerramento(String data_encerramento) {
		this.data_encerramento = data_encerramento;
	}

	public void cadastrar(Aluno_Turma aluno_turma) throws Exception{
		//new AlunoTurmaDao().cadastrarAlunoTurma(aluno_turma);
	}	
	
	public void alterar(Aluno_Turma aluno_turma) throws Exception{
		//new AlunoTurmaDao().alterarAlunoTurma(aluno_turma);
	}	
	
	public void excluir(int cod) throws Exception{
		//new AlunoTurmaDao().excluirAlunoTurma(cod);
	}	
	
	public void buscar(int cod) throws Exception{
		//new AlunoTurmaDao().buscarAlunoTurma(cod)
	}
	public ArrayList<String> listar() throws Exception{
		//return new AlunoTurmaDao().listarAlunoTurma();
		return null;
	}
	}