package dao;

import java.sql.DriverManager;

public class Connection {
protected java.sql.Connection con = null;
	
	public Connection() throws Exception {
		if (con == null){
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/SCOA_BD","root","root");
		}
	}
}
