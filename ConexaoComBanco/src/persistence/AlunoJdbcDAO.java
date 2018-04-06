package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<Aluno> listar() {
		String sql = "select * from alunos";
        System.out.println(sql);		
        List<Aluno> Aluno = new ArrayList<Aluno>();
		try {
			PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
			ResultSet rs = prepareStatement.executeQuery();
			while(rs.next()) {				
				String nome = rs.getString("nome");
				String endereco = rs.getString("endereco");
				String bairro = rs.getString("bairro");				
				Aluno aluno = new Aluno();				
				aluno.setNome(nome);
				aluno.setEndereco(endereco);
				aluno.setBairro(bairro);
				
			}
			prepareStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Aluno;
	}
}
