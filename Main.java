package app;

import models.*;
/*
 * Essa é a classe principal que instancia os objetos mencionados
 * nas classes em "models".
 * 
 * @author taynara
 * version 1.0
 */


public class Main {
	public static void main(String[]args) {
		//Instanciando objeto
		Filme movie1 = new Filme();
		
		//Fazendo um try catch que acompanha o Exception.
		try {
			//Declarando valores dos atributos
			movie1.setTitulo("Como perder um cara em 10 dias");
			movie1.setGenero(Filme.Genero.Romance);
			movie1.setDuracao(191);
			
			//Printando para o usuário
			System.out.println("Seu filme foi criado com êxito!");
			System.out.println("Título: " + movie1.getTitulo() +
			"\nGênero: " + movie1.getGenero() + 
			"\nDuração: " + movie1.getDuracao() + " min.");
		
		// Caso dê erro o exception será ativado.
		} catch (Exception e) {
			System.out.println("Erro ao criar o filme.\n" + e.getMessage());
		}
		
	}
}
