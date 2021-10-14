package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Professor;

public class ProfessorDao extends Connection {
	private PreparedStatement pstm = null;
	private ResultSet rs = null;

	public ProfessorDao() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
public void cadastrarProfessor(Professor professor) throws Exception{
		JOptionPane.showMessageDialog(null, "Entrou na dao");
		String sql= "INSERT INTO professor" + "(ID_USUARIO, DESCRICAO_ACADEMICA)" + 
	          "  VALUES (?,?)";
		try{
		pstm = con.prepareStatement(sql);
		pstm.setInt(1, professor.getId_usuario());
		pstm.setString(2, professor.getDescricao_academica());
		
		
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

public void excluirProfessor(int id) throws Exception{
	try{
		String sql="DELETE FROM professor WHERE IDPROFESSOR = ?";
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

public void alterarProfessor(Professor professor) throws Exception {
	String sql= "UPDATE professor SET ID_USUARIO = ?, DESCRICAO_ACADEMICA = ?"
			+ " WHERE IDPROFESSOR = ?";
		try{
		pstm = con.prepareStatement(sql);
		pstm.setInt(1, professor.getId_usuario());
		pstm.setString(2, professor.getDescricao_academica());
		pstm.setInt(3, professor.getId_professor());
		
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

public ArrayList<Professor> listarProfessors() throws Exception {
	
	ArrayList<Professor> lista = new ArrayList<Professor>();
	String sql="SELECT * FROM professor";
	try {
		pstm=con.prepareStatement(sql);
		rs=pstm.executeQuery();
		while (rs.next()){
			Professor professor = new Professor();
			professor.setId_professor(rs.getInt("IDPROFESSOR"));
			professor.setId_usuario(rs.getInt("ID_USUARIO"));
			professor.setDescricao_academica(rs.getString("DESCRICAO_ACADEMICA"));
			lista.add(professor);
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