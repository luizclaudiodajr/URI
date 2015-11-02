package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double x1, x2, y1, y2, x, y, distancia;

		Scanner input = new Scanner(System.in);

		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();

		input.close();

		x = x2 - x1;
		y = y2 - y1;

		distancia = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

		System.out.printf("%.4f\n", distancia);
	}
}