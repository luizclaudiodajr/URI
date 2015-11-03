package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		int distancia, tempo;
		
		Scanner input = new Scanner(System.in);
		
		distancia = input.nextInt();
		
		input.close();
		
		tempo = distancia*2;
		
		System.out.printf("%d minutos\n",tempo);
	}
}