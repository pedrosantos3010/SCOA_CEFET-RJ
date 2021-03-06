package controller;

import java.util.ArrayList;

import model.Plano_Estudos;

public class Plano_EstudosController {
	public boolean cadastrarPlanos_Estudos(int periodo, int id_curso_aluno, int id_disciplina) throws Exception{		
		if (periodo > 0 && id_curso_aluno > 0 && id_disciplina > 0){
			Plano_Estudos planos_estudos = new Plano_Estudos(periodo, id_curso_aluno, id_disciplina);
			planos_estudos.cadastrar(planos_estudos);
			return true;
		} 
			return false;
	}	
	
public boolean alterarPlanos_Estudos(int id, int periodo, int id_curso_aluno, int id_disciplina) throws Exception{
		
		if (id > 0 && periodo > 0 && id_curso_aluno > 0 && id_disciplina > 0){
			Plano_Estudos planos_estudos = new Plano_Estudos(periodo, id_curso_aluno, id_disciplina);
			planos_estudos.alterar(planos_estudos);
			return true;
		} 
			return false;
	}
	
	public boolean excluirPlanos_Estudos(int cod) throws Exception {
		
		if (cod == 0){
			return false;
		}
		
		new Plano_Estudos().excluir(cod);
			return true;
	}
	
	public ArrayList<Plano_Estudos> listarPlanos_Estudos() throws Exception{
		return new Plano_Estudos().listar();
	}
	
	public ArrayList<Plano_Estudos> listarPlanos_Estudos(int idcursoaluno) throws Exception{
		return new Plano_Estudos().listar(idcursoaluno);
	}
	
	public Plano_Estudos buscarPlanos_Estudos(int id) throws Exception{
		return new Plano_Estudos().buscar(id);
	}
}

