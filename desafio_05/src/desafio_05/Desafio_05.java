package desafio_05;

// 10. Write a Java program to find the maximum and minimum value of an array.

public class Desafio_05 {

	public static void main(String[] args) {

		int[] valores = new int[] { 10, 81, 456, 46, 1, 60, 5, 8, 2, 48 };
		int menorValor = 0, maiorValor = 0;

		for (int i = 0; i < valores.length; i++) {

			if (i == 0) {
				menorValor = valores[i];
				maiorValor = valores[i];
			} else {

				if (valores[i] < menorValor) {
					menorValor = valores[i];
				}

				if (valores[i] > maiorValor) {
					maiorValor = valores[i];
				}
			}
		}

		System.out.println("Maior valor do array é " + maiorValor);
		System.out.println("Menor valor do array é " + menorValor);
	}
}