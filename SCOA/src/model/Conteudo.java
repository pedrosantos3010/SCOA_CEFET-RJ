package model;

import java.util.ArrayList;

public class Conteudo{
	int id_conteudo, id_turma;
	String conteudo;
	
	public Conteudo(int id_conteudo, int id_turma, String conteudo) {
		super();
		this.id_conteudo = id_conteudo;
		this.id_turma = id_turma;
		this.conteudo = conteudo;
	}

	public int getId_conteudo() {
		return id_conteudo;
	}

	public void setId_conteudo(int id_conteudo) {
		this.id_conteudo = id_conteudo;
	}

	public int getId_turma() {
		return id_turma;
	}

	public void setId_turma(int id_turma) {
		this.id_turma = id_turma;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public void cadastrar(Conteudo conteudo) throws Exception{
		//new ConteudoDao().cadastrarConteudo(conteudo);
	}	
	
	public void alterar(Conteudo conteudo) throws Exception{
		//new ConteudoDao().alterarConteudo(conteudo);
	}	
	
	public void excluir(int cod) throws Exception{
		//new ConteudoDao().excluirConteudo(cod);
	}	
	
	public void buscar(int cod) throws Exception{
		//new ConteudoDao().buscaConteudor(cod)
	}
	public ArrayList<String> listarAtores() throws Exception{
		//return new ConteudoDao().listarConteudo();
		return null;
	}
}