package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Livros livros = new Livros();

		int a = 1;
		int b = 2;

		System.out.println("Hello World " + (a + b));
		System.out.println(gato);
		System.out.println(livros);
	}

}

class Livros {
	
	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", npag=" + npag + "]";
	}
	private String nome;
	private String npag;

}
