package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Aluno;

public class AlunoJdbcDAO {

	private Connection conn;

	public AlunoJdbcDAO(Connection conn) {
		this.conn = conn;
	}

	public void salvar(Aluno a) throws SQLException {
		String sql = "insert into alunos (nome, endereco, bairro) values ('" + a.getNome() + "','" + a.getEndereco()
				+ "','" + a.getBairro() + "')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
		prepareStatement.close();
	}
}
