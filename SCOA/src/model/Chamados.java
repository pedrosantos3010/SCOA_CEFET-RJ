package model;

import java.util.ArrayList;

public class Chamados{
	int idchamado, id_aluno;
	String titulo,	mensagem, tipo_chamado;
	
	
	public Chamados(int idchamado, int id_aluno, String titulo, String mensagem, String tipo_chamado) {
		super();
		this.idchamado = idchamado;
		this.id_aluno = id_aluno;
		this.titulo = titulo;
		this.mensagem = mensagem;
		this.tipo_chamado = tipo_chamado;
	}
	
	public int getIdchamado() {
		return idchamado;
	}

	public void setIdchamado(int idchamado) {
		this.idchamado = idchamado;
	}

	public int getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getTipo_chamado() {
		return tipo_chamado;
	}

	public void setTipo_chamado(String tipo_chamado) {
		this.tipo_chamado = tipo_chamado;
	}

	public void cadastrar(Chamados chamados) throws Exception{
		//new ChamadosDao().cadastrarChamados(chamados);
	}	
	
	public void alterar(Chamados chamados) throws Exception{
		//new ChamadosDao().alterarChamados(chamados);
	}	
	
	public void excluir(int cod) throws Exception{
		//new ChamadosDao().excluirChamados(cod);
	}	
	
	public void buscar(int cod) throws Exception{
		//new ChamadosDao().buscaChamadosr(cod)
	}
	public ArrayList<String> listarAtores() throws Exception{
		//return new ChamadosDao().listarChamados();
		return null;
	}
	}