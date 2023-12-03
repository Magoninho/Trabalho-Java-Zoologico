package com.mago.zoologico;

import com.mago.zoologico.Animais.Golfinho;

public class Zoologico {

	public static void main(String[] args) {
//		FuncionariosLoader loader = new FuncionariosLoader();
//		
//		try {
//			loader.loadNamesFromFile("funcionarios.txt");
//		} catch (ErroArquivoException e) {
//			e.printStackTrace();
//		}

//		Aquario aquario = new Aquario();
//
//		aquario.adicionarAnimal(new Golfinho("beto", 6, 'M'));
//
//		System.out.println(aquario.animais);

		Visita visita = new Visita();

		visita.adicionarVisitante(new Visitante("Moacir", 69));

		System.out.println(visita.getVisitantes());
		
	}
}
