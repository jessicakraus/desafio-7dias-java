package desafio_07;

import java.util.ArrayList;

// 27. Write a Java program to find the number of even and odd integers in a given array of integers. 

public class Desafio_07 {

	public static void main(String[] args) {

		int[] valores = new int[] { 23, 65, 254, 85, 55, 7, 48, 94 };
		ArrayList<Integer> valoresPares = new ArrayList<Integer>();
		ArrayList<Integer> valoresImpares = new ArrayList<Integer>();

		int quantidadePares = 0, quantidadeImpares = 0;

		for (int i = 0; i < valores.length; i++) {

			if (valores[i] % 2 != 0) {
				quantidadeImpares++;
				valoresImpares.add(valores[i]);
			} else {
				quantidadePares++;
				valoresPares.add(valores[i]);
			}

		}

		System.out.println("A quantidade de números ímpares é " + quantidadeImpares + " e seus valores são " + valoresImpares);
		System.out.println("A quantidade de números pares é " + quantidadePares + " e seus valores são " + valoresPares);
	}
}