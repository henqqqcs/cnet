package com.trabalho.poo;

public class ConexaoMySQL implements Conexao {
	
	public Conexao connectar() {
		return new ConexaoMySQL();
	}
}
