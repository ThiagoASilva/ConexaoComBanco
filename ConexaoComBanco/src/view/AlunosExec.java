package view;

import java.sql.Connection;

import model.Aluno;
import persistence.AlunoJdbcDAO;
import persistence.Conexao;

public class AlunosExec {
	public static void main(String args[]) {
		Aluno aluno = new Aluno();
		try{
		
			aluno.setNome("Thiago Afonso Silva");
			aluno.setEndereco("Av Águia de Haia, 2600");
			aluno.setBairro("Jd São Nicolau");
			
			Connection connection = Conexao.getConnection();
			AlunoJdbcDAO.salvar(aluno);
		}
		
	}

}
