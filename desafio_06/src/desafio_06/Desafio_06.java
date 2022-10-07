package desafio_06;

/* 39. Write a Java program to print all the LEADERS in the array.
Note: An element is leader if it is greater than all the elements to its right side. */

public class Desafio_06 {

	public static void main(String[] args) {

		int[] valores = new int[] { 20, 61, 256, 42, 50, 6, 4, 1 };
		int leader = 0;

		System.out.println("Os leaders do array que tem seu valor maior que os valores dos elementos à direita são: ");

		for (int i = 0; i < valores.length; i++) {
			leader = valores[i];
			for (int j = i + 1; j < valores.length; j++) {
				if (valores[i] > valores[j]) {
					if (valores[j] < valores.length - 1) {
						leader = valores[i];
					}
				} else {
					leader = 0;
					break;
				}
			}
			if (leader != 0) {
				System.out.println(leader);
			}
		}
	}
}