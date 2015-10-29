package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		double A, B, C, MEDIA;

		Scanner entrada = new Scanner(System.in);

		A = entrada.nextDouble();
		B = entrada.nextDouble();
		C = entrada.nextDouble();

		entrada.close();

		MEDIA = ((2 * A) + (3 * B) + (5 * C)) / 10;

		System.out.printf("MEDIA = %.1f\n", MEDIA);
	}
}