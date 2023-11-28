package com.mago.zoologico.Animais;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.mago.zoologico.ErroArquivoException;


// essa classe armazena os funcionarios em um arraylist através dos nomes vindos de um arquivo .txt
public class FuncionariosLoader {
	public void loadNamesFromFile(String filename) throws ErroArquivoException {
		try {
	      File myObj = new File(filename);
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      throw new ErroArquivoException();
	    }
	}
}
