package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a, b, PROD;

		Scanner entrada = new Scanner(System.in);

		a = entrada.nextInt();
		b = entrada.nextInt();

		entrada.close();

		PROD = a * b;

		System.out.printf("PROD = %d\n", PROD);
	}
}
