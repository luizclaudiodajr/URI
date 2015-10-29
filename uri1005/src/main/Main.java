package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double A, B, MEDIA;
		final double MAX = 10.0f;

		Scanner entrada = new Scanner(System.in);

		A = entrada.nextDouble();
		B = entrada.nextDouble();

		entrada.close();

		MEDIA = ((3.5 * A) + (7.5 * B)) / 11;

		MEDIA = MEDIA > MAX ? MAX : MEDIA;

		System.out.printf("MEDIA = %.5f\n", MEDIA);
	}
}