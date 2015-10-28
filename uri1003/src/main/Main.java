package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int A, B, SOMA;
		
		Scanner entrada = new Scanner(System.in);
		
		A = entrada.nextInt();
		B = entrada.nextInt();
		
		entrada.close();
		
		SOMA = A+B;
		
		System.out.printf("SOMA = %d\n",SOMA);
	}
}
