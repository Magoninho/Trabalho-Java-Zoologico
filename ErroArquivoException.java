package com.mago.zoologico;

public class ErroArquivoException extends Exception {
		
		private static final long serialVersionUID = 1L;

		// polimorfismo de sobrecarga
      	public ErroArquivoException() {}

      	public ErroArquivoException(String message) {
      		super(message);
      	}
 }