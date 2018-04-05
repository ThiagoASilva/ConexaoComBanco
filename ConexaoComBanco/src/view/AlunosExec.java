package view;

import java.sql.Connection;
import java.sql.SQLException;

import model.Aluno;
import persistence.AlunoJdbcDAO;

public class AlunosExec {
	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		Aluno aluno = new Aluno();
		aluno.setNome("Thiago Afonso Silva");
		aluno.setEndereco("Av Águia de Haia, 2600");
		aluno.setBairro("Jd São Nicolau");
		Connection connection = persistence.Conexao.getConexao();
		AlunoJdbcDAO tt = new AlunoJdbcDAO(connection);
		tt.salvar(aluno);
	}	
}