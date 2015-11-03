package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int tempo, velMedia, distancia;
		double consumo;
		final float autonomia = 12;
		
		Scanner input = new Scanner(System.in);
		
		tempo = input.nextInt();
		velMedia = input.nextInt();
		
		input.close();
		
		distancia = tempo*velMedia;
		consumo = distancia/autonomia;
		
		System.out.printf("%.3f\n",consumo);
	}
}