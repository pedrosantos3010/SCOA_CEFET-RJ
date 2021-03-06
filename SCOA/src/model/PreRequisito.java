package model;

import java.util.ArrayList;

import dao.PreRequisitoDao;

public class PreRequisito{
	int idDisciplina, idDisciplinaRequisito;
	Disciplina disciplina, disciplinarequisito;

	public PreRequisito(int idDisciplina, int idDisciplinaRequisito) {
		super();
		this.idDisciplina = idDisciplina;
		this.idDisciplinaRequisito = idDisciplinaRequisito;
	} 
	
	public PreRequisito() {

	}
	
	

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Disciplina getDisciplinarequisito() {
		return disciplinarequisito;
	}

	public void setDisciplinarequisito(Disciplina disciplinarequisito) {
		this.disciplinarequisito = disciplinarequisito;
	}

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public int getIdDisciplinaRequisito() {
		return idDisciplinaRequisito;
	}

	public void setIdDisciplinaRequisito(int idDisciplinaRequisito) {
		this.idDisciplinaRequisito = idDisciplinaRequisito;
	}

	public void cadastrar(PreRequisito prerequisito) throws Exception{
		new PreRequisitoDao().cadastrarPreRequisito(prerequisito);
	}	
	
	public void alterar(PreRequisito prerequisito) throws Exception{
		new PreRequisitoDao().alterarPreRequisito(prerequisito);
	}	
	
	public void excluir(PreRequisito prerequisito) throws Exception{
		new PreRequisitoDao().excluirPreRequisito(prerequisito);
	}	
	
	public ArrayList<PreRequisito> listarPreRequisitos() throws Exception{
		return new PreRequisitoDao().listarPreRequisitos();
	}
	
	public ArrayList<PreRequisito> listarPreRequisitos(int iddisciplina) throws Exception{
		return new PreRequisitoDao().listarPreRequisitos(iddisciplina);
	}
	
}