package com.trabalho.poo;

public class ConexaoOracle implements Conexao{

	public Conexao connectar() {
		return new ConexaoOracle();
	}

}
