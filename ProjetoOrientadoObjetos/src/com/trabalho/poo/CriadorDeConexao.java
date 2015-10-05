package com.trabalho.poo;

public class CriadorDeConexao {

	public static Conexao criarConexao(String configuracao) {
		
		if (configuracao.equals("mysql")) {
			return new ConexaoMySQL().connectar();
		} else if (configuracao.equals("oracle")) {
			return new ConexaoOracle().connectar();
		} else {
			return new ConexaoSQLServer().connectar();
		}
		
	}

}




