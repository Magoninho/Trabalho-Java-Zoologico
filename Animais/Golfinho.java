package com.mago.zoologico.Animais;

public class Golfinho extends Animal implements Aquatico {

	public Golfinho(String nome, int idade, char genero) {
		super(nome, idade, genero);
	}
	
	@Override
	public String toString() {
		String finalString = "Nome: " + getNome() + "\n" +
							 "Idade: " + getIdade() + "\n" +
							 "Genero: " + getGenero() + "\n";
		
		return finalString;
							 
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Golfinho faz barulho");
		
	}

	@Override
	public void mover() {
		System.out.println("Golfinho se move");
		
	}

	public void nadar() {
		System.out.println("Golfinho nada");
		
	}
}
