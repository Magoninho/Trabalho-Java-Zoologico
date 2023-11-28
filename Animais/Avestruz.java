package com.mago.zoologico.Animais;

public class Avestruz extends Animal implements Voador {

	public Avestruz(String nome, int idade, char genero) {
		super(nome, idade, genero);
	}
	
	@Override
	public String toString() {
		String finalString = "Nome: " + getNome() + "\n" +
							 "Idade: " + getIdade() + "\n" +
							 "Genero: " + getGenero() + "\n";
		
		return finalString;
							 
	}

	public void voar() {
		System.out.println("avestruz voa");
		
	}

	@Override
	public void fazerBarulho() {
		System.out.println("avestruz faz barulho");
		
	}

	@Override
	public void mover() {
		System.out.println("avestruz se move");
		
	}
}
