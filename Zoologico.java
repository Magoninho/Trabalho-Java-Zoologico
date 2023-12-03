package com.mago.zoologico;

import com.mago.zoologico.Animais.Golfinho;
import com.mago.zoologico.Funcionarios.FuncionariosManager;

import java.io.IOException;
import java.util.Scanner;

public class Zoologico {
	public static int userInput(Scanner prompt) {
		int a = 0;
		while (true) {
			try {
				a = Integer.parseInt(prompt.nextLine());
				break;

			} catch (NumberFormatException e) {
				System.out.println("Informe uma opção válida");
			}
		}

		return a;
	}

	public static void main(String[] args) throws FileReadError, FileWriteError {

		int a = 0;

		while (a != 4) {
			Scanner prompt = new Scanner(System.in);

			System.out.println("Bem vindo ao zoologico o que voce deseja fazer?");

			System.out.println("1 - Visualizar funcionarios cadastrados");
			System.out.println("2 - Cadastrar funcionario");
			System.out.println("3 - Iniciar uma visita");
			System.out.println("4 - Sair");

			a = userInput(prompt);

			switch (a) {
				case 1:
					FuncionariosManager loader = new FuncionariosManager();

					try {
						loader.loadNamesFromFile("funcionarios.txt");
					} catch (FileReadError e) {
						throw new FileReadError();
					}
					System.out.print("\nAperte enter para continuar...");
					prompt.nextLine();
					break;
				case 2:
					System.out.print("Nome do funcionário: ");
					String nome = prompt.nextLine();
					FuncionariosManager funcionariosManager = new FuncionariosManager();
					funcionariosManager.cadastrarFuncionario(nome);
					break;
				case 3:
					Visita visita = new Visita();
					int na = 0;

					while (na != 3) {
						System.out.println("Começando nova visita");
						System.out.println("O que deseja fazer?");
						System.out.println("1 - Adicionar visitante");
						System.out.println("2 - Visualizar visitantes");
						System.out.println("3 - Voltar");

						na = userInput(prompt);

						switch (na) {
							case 1:
								System.out.print("Nome do visitante: ");
								String visitanteNome = prompt.nextLine();
								System.out.print("Idade do visitante: ");
								int idadeVisitante = userInput(prompt);
								Visitante visitante = new Visitante(visitanteNome, idadeVisitante);
								visita.adicionarVisitante(visitante);

								System.out.println("Visitante adicionado com sucesso!");
								break;
							case 2:
								System.out.println(visita.toString());

								break;
							default:
								break;
						}


					}
					break;
				default:
					break;
			}
		}


	}
}
