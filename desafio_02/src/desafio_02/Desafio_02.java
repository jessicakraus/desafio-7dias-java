package desafio_02;

import java.util.ArrayList;

// 20. Write a Java program to convert an array to ArrayList. 

public class Desafio_02 {

	public static void main(String[] args) {

		ArrayList<String> listaFrutas = new ArrayList<String>();
		String[] frutas = new String[] { "Morango", "Banana", "Maça", "Uva" };

		for (int i = 0; i < frutas.length; i++) {
			listaFrutas.add(frutas[i]);
		}
		System.out.println(listaFrutas);
	}

}
