package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int A,  B, C, D, DIFERENCA;
		
		Scanner entrada = new Scanner(System.in);
		
		A = entrada.nextInt();
		B = entrada.nextInt();
		C = entrada.nextInt();
		D = entrada.nextInt();
		
		entrada.close();
		
		DIFERENCA = (A * B - C * D);
		
		System.out.printf("DIFERENCA = %d\n",DIFERENCA);
	}
}