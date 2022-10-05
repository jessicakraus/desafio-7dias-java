package desafio_04;

// 2. Write a Java program to sum values of an array.  

public class Desafio_04 {

	public static void main(String[] args) {

		int[] valores = new int[] { 10, 85, 456, 48, 62 };
		int soma = 0;

		for (int i = 0; i < valores.length; i++) {
			soma += valores[i];
		}
		System.out.println("A soma dos valores do array é " + soma);
	}

}