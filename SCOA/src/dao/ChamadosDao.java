package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Chamados;

public class ChamadosDao extends Connection {
	private PreparedStatement pstm = null;
	private ResultSet rs = null;

	public ChamadosDao() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
public void cadastrarChamados(Chamados chamados) throws Exception{
		
		String sql= "INSERT INTO chamado" + "(ID_USUARIO, TITULO, MENSAGEM, TIPO_CHAMADO)" + 
	          "  VALUES (?,?,?,?)";
		try{
		pstm = con.prepareStatement(sql);
		pstm.setInt(1, chamados.getId_usuario());
		pstm.setString(2, chamados.getTitulo());
		pstm.setString(3, chamados.getMensagem());
		pstm.setString(4, chamados.getTipo_chamado());
		
		
		pstm.executeUpdate();
		
		} catch(SQLException e){
			throw new Exception("Erro ao cadastrar:" + e);
		} finally {
			try {
				if (pstm != null){ 
						pstm.close();
					};
			}catch (SQLException e){
				throw new Exception("Erro ao fechar o Statement:" + e);
			}
			try {
				if (con != null){
					con.close();
				}
			}catch(SQLException e){
				throw new Exception("Erro ao fechar a conex�o:" + e);
			}
		}
	}

public void excluirChamados(int id) throws Exception{
	try{
		String sql="DELETE FROM chamado WHERE IDCHAMADO = ?";
		pstm=con.prepareStatement(sql);		
		pstm.setInt(1, id);		
		pstm.executeUpdate();
	} catch (SQLException e) {
		throw new Exception("Erro:" + e);
	} finally {
		try {
			if (pstm != null){ 
					pstm.close();
				};
		}catch (SQLException e){
			throw new Exception("Erro ao fechar o Statement:" + e);
		}
		try {
			if (con != null){
				con.close();
			}
		}catch(SQLException e){
			throw new Exception("Erro ao fechar a conex�o:" + e);
		}
	}	
}

public void alterarChamados(Chamados chamados) throws Exception {
	String sql= "UPDATE chamado SET ID_USUARIO = ?, TITULO = ?, MENSAGEM = ?, TIPO_CHAMADO = ?"
			+ " WHERE IDCHAMADO = ?";
		try{
		pstm = con.prepareStatement(sql);
		pstm.setInt(1, chamados.getId_usuario());
		pstm.setString(2, chamados.getTitulo());
		pstm.setString(3, chamados.getMensagem());
		pstm.setString(4, chamados.getTipo_chamado());
		pstm.setInt(5, chamados.getIdchamado());
		
		pstm.executeUpdate();
		
		} catch(SQLException e){
			throw new Exception("Erro no update:" + e);
		} finally {
			try {
				if (pstm != null){ 
						pstm.close();
					};
			}catch (SQLException e){
				throw new Exception("Erro ao fechar o Statement:" + e);
			}
			try {
				if (con != null){
					con.close();
				}
			}catch(SQLException e){
				throw new Exception("Erro ao fechar a conex�o:" + e);
			}
		}
}

public ArrayList<Chamados> listarChamados() throws Exception {
	
	ArrayList<Chamados> lista = new ArrayList<Chamados>();
	String sql="SELECT * FROM chamado";
	try {
		pstm=con.prepareStatement(sql);
		rs=pstm.executeQuery();
		while (rs.next()){
			Chamados chamados = new Chamados();
			chamados.setId_usuario(rs.getInt("ID_USUARIO"));
			chamados.setTitulo(rs.getString("TITULO"));
			chamados.setMensagem(rs.getString("MENSAGEM"));
			chamados.setTipo_chamado(rs.getString("TIPO_CHAMADO"));
			chamados.setIdchamado(rs.getInt("IDCHAMADO"));
			lista.add(chamados);
	    	}
		} catch (SQLException e) {
			throw new Exception("Erro:" + e);
		} finally {
			try {
				if (pstm != null){ 
						pstm.close();
					};
			}catch (SQLException e){
				throw new Exception("Erro ao fechar o Statement:" + e);
			}
			try {
				if (con != null){
					con.close();
				}
			}catch(SQLException e){
				throw new Exception("Erro ao fechar a conex�o:" + e);
			}
		}
		
	return  lista;

	}
}