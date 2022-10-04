package desafio_03;

import java.util.Scanner;

//5. Write a Java program to test if an array contains a specific value

public class Desafio_03 {

	public static void main(String[] args) {

		String[] animais = new String[] { "Capivara", "Cachorro", "Ornitorrinco", "Calopsita" };
		String nomeAnimal = "";
		int controle = 0;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o nome do animal: ");
		nomeAnimal = leitor.nextLine();

		for (int i = 0; i < animais.length; i++) {
			if (animais[i].contains(nomeAnimal)) {
				System.out.print("O animal: " + animais[i] + " foi encontrado na posição " + i + " do array.");
				controle++;
			}
		}

		if (controle < 1) {
			System.out.print("O animal: " + nomeAnimal + " não foi encontrado no array.");
		}

		leitor.close();
	}
}