package desafio_01;

/* 3. Write a Java program to print the following grid. 

Expected Output :

- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - - */

public class Desafio_01 {

	public static void main(String[] args) {

		String hifen = "-";
		String espaco = " ";

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf(hifen + espaco);
			}

			System.out.println();
		}
	}
}