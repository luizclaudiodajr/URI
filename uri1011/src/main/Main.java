package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int raio;
		double volume;
		final double pi = 3.14159;
		
		Scanner entrada = new Scanner(System.in);
		
		raio = entrada.nextInt();
		
		entrada.close();
		
		volume = (4.0/3.0)*pi*Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f\n",volume);
	}
}