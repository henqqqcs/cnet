package com.trabalho.poo;

public class ConexaoSQLServer implements Conexao{

	public Conexao connectar() {
		return new ConexaoSQLServer();
	}

}
