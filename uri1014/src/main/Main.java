package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int X;
		float Y, consumo;
		
		Scanner input = new Scanner(System.in);
		
		X = input.nextInt();
		Y = input.nextFloat();
		
		input.close();
		
		consumo = X/Y;
		
		System.out.printf("%.3f km/l\n",consumo);
	}
}