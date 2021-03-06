package model;

import java.util.ArrayList;

import dao.SalaDao;

public class Sala {
	int idsala, numero_sala;
	String localizacao;

	public Sala(int numero_sala, String localizacao) {
		super();
		this.numero_sala = numero_sala;
		this.localizacao = localizacao;
	}

	public Sala() {

	}

	public int getIdsala() {
		return idsala;
	}

	public void setIdsala(int idsala) {
		this.idsala = idsala;
	}

	public int getNumero_sala() {
		return numero_sala;
	}

	public void setNumero_sala(int numero_sala) {
		this.numero_sala = numero_sala;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public void cadastrar(Sala sala) throws Exception {
		new SalaDao().cadastrarSala(sala);
	}

	public void alterar(Sala sala) throws Exception {
		new SalaDao().alterarSala(sala);
	}

	public void excluir(int cod) throws Exception {
		new SalaDao().excluirSala(cod);
	}

	public Sala buscar(int cod) throws Exception {
		return new SalaDao().buscarSala(cod);
	}

	public ArrayList<Sala> listar() throws Exception {
		return new SalaDao().listarSalas();
	}

	@Override
	public String toString() {
		return "Sala " + numero_sala;
	}

}
