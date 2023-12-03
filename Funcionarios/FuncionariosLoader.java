package com.mago.zoologico.Funcionarios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.mago.zoologico.ErroArquivoException;


// essa classe armazena os funcionarios em um arraylist através dos nomes vindos de um arquivo .txt
public class FuncionariosLoader {
	public void loadNamesFromFile(String filename) throws ErroArquivoException {
		try {
	      File file = new File(filename);
	      Scanner scanner = new Scanner(file);
	      while (scanner.hasNextLine()) {
	        String data = scanner.nextLine();
	        System.out.println(data);
	      }
		  scanner.close();
	    } catch (FileNotFoundException e) {
	      throw new ErroArquivoException();
	    }
	}
}
