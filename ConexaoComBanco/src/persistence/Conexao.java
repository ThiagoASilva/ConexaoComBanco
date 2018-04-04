package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public Conexao() {
		Connection conn = null;
		try {
			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "");
			System.out.println("Conectado!");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) throws SQLException {
		Conexao conexao = new Conexao();	
	}
}
