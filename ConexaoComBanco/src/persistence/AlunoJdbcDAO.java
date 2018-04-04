package persistence;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import model.Aluno;

public class AlunoJdbcDAO {

	private Connection conn;
	
	public AlunoJdbcDAO(Connection conn) {
		
	}
	
	public void salvar(Aluno a) throws SQLException {
		String sql = "insert into tb_clientes values ('"+ a.getNome()+"','"+a.getEndereco()+"','"+a.getBairro()+"','";
		System.out.println(sql);
		PreparedStatement preparedStatement = (PreparedStatement) this.conn.prepareStatement(sql);
		preparedStatement.executeUpdate();
		preparedStatement.close();
	}
}
