package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double a, b, c, delta, x1, x2;

		Scanner input = new Scanner(System.in);

		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

		input.close();

		delta = Math.pow(b, 2) - 4 * a * c;

		if ((delta >= 0) && (a != 0)) {

			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.printf("R1 = %.5f\n", x1);
			System.out.printf("R2 = %.5f\n", x2);

		} else {

			System.out.println("Impossivel calcular");
		}
	}
}