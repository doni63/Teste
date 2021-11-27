package com.dio;

import model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato1 = new Gato("Thor", "Cinza", 8);
		
		System.out.println(gato1.getNome() + ", " + gato1.getCor() + ", " + gato1.getIdade());
	}

}
