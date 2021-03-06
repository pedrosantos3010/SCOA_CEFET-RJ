package controller;

import java.util.ArrayList;

import model.Sala;

public class SalaController {
	public boolean cadastrarSala(int numero_sala, String localizacao) throws Exception {
		if (numero_sala > 0 && localizacao != null && localizacao.length() > 0) {
			Sala sala = new Sala(numero_sala, localizacao);
			sala.cadastrar(sala);
			return true;
		}
		return false;
	}

	public boolean alterarSala(int id, int numero_sala, String localizacao) throws Exception {

		if (id > 0 && numero_sala > 0 && localizacao != null && localizacao.length() > 0) {
			Sala sala = new Sala(numero_sala, localizacao);
			sala.alterar(sala);
			return true;
		}
		return false;
	}

	public boolean excluirSala(int cod) throws Exception {

		if (cod == 0) {
			return false;
		}

		new Sala().excluir(cod);
		return true;
	}

	public ArrayList<Sala> listarSalas() throws Exception {
		return new Sala().listar();
	}

	public Sala buscarSala(int id) throws Exception {
		return new Sala().buscar(id);
	}

}
