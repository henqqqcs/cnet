package com.trabalho.poo;

public class Configuracao {

	private static Configuracao instancia;

	// construtor privado
	private Configuracao() {
		System.out.println("Criando instancia da clsse: Configuracao");
		// lê as configurações do servidor, por exemplo
	}

	public static Configuracao getInstancia() {
		if (instancia == null)
			instancia = new Configuracao();
		return instancia;
	}

}


