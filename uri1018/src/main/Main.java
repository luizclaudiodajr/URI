package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		int n, n100, n50, n20, n10, n5, n2, n1;
		float resto;

		Scanner input = new Scanner(System.in);

		n = input.nextInt();

		input.close();

		resto = n;
		n100 = (int) Math.floor(resto / 100);

		resto = (resto - n100 * 100);
		n50 = (int) Math.floor(resto / 50);

		resto = (resto - n50 * 50);
		n20 = (int) Math.floor(resto / 20);

		resto = (resto - n20 * 20);
		n10 = (int) Math.floor(resto / 10);

		resto = (resto - n10 * 10);
		n5 = (int) Math.floor(resto / 5);

		resto = (resto - n5 * 5);
		n2 = (int) Math.floor(resto / 2);

		resto = (resto - n2 * 2);
		n1 = (int) Math.floor(resto / 1);

		System.out.printf("%d\n", n);
		System.out.printf("%d nota(s) de R$ 100,00\n", n100);
		System.out.printf("%d nota(s) de R$ 50,00\n", n50);
		System.out.printf("%d nota(s) de R$ 20,00\n", n20);
		System.out.printf("%d nota(s) de R$ 10,00\n", n10);
		System.out.printf("%d nota(s) de R$ 5,00\n", n5);
		System.out.printf("%d nota(s) de R$ 2,00\n", n2);
		System.out.printf("%d nota(s) de R$ 1,00\n", n1);
	}
}