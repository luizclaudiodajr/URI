package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		final double pi = 3.14159;

		double area, raio;

		Scanner entrada = new Scanner(System.in);

		raio = entrada.nextDouble();

		area = pi * Math.pow(raio, 2);

		entrada.close();

		System.out.printf("A=%.4f\n", area);
	}
}