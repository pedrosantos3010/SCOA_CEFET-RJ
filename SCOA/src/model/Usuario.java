package model;

import java.sql.Date;
import java.util.ArrayList;

import dao.UsuarioDao;

public class Usuario {
	int id_usuario, tipo, num;

	String nome_usuario, email_usuario, senha;
	String uf, cidade, bairro, rua, tel, comp, CPF;
	Date ingresso;

	public Usuario(String nome_usuario, String email_usuario, Date ingresso, String senha, String uf, String cidade,
			String bairro, String rua, int num, String comp, int tipo, String CPF, String tel) {
		super();
		this.nome_usuario = nome_usuario;
		this.email_usuario = email_usuario;
		this.ingresso = ingresso;
		this.senha = senha;
		this.uf = uf;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.tipo = tipo;
		this.CPF = CPF;
		this.tel = tel;
		this.num = num;
		this.comp = comp;
	}

	public Usuario() {

	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public String getEmail_usuario() {
		return email_usuario;
	}

	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	public Date getIngresso() {
		return ingresso;
	}

	public void setIngresso(Date ingresso) {
		this.ingresso = ingresso;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public int cadastrar(Usuario usuario) throws Exception {
		UsuarioDao dao = new UsuarioDao();
		return dao.cadastrarUsuario(usuario);
	}

	public void alterar(Usuario usuario) throws Exception {
		new UsuarioDao().alterarUsuario(usuario);
	}

	public void excluir(int cod) throws Exception {
		new UsuarioDao().excluirUsuario(cod);
	}

	public Usuario buscar(String email) throws Exception {
		return new UsuarioDao().buscarUsuario(email);
	}

	public Usuario buscar(int idusuario) throws Exception {
		return new UsuarioDao().buscarUsuario(idusuario);
	}

	public ArrayList<Usuario> listarUsuarios(int tipo) throws Exception {
		return new UsuarioDao().listarUsuarios(tipo);

	}
	
	public String toString(){
		return getNome_usuario();
	}

}