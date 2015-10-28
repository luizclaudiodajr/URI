package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int X, A, B;

		Scanner teclado = new Scanner(System.in);

		A = teclado.nextInt();
		B = teclado.nextInt();

		X = A + B;

		teclado.close();

		System.out.printf("X = %d\n", X);
	}
}
