package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int n100, n50, n20, n10, n5, n2, m1, m50, m25, m10, m05 ,m01;
		double n, resto;

		Scanner input = new Scanner(System.in);

		n = input.nextDouble();

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
		m1 = (int) Math.floor(resto / 1);
		
		resto = (resto - m1 * 1);
		m50 = (int) Math.floor(resto / 0.5);
		
		resto = (resto - m50 * 0.5);
		m25 = (int) Math.floor(resto / 0.25);
		
		resto = (resto - m25 * 0.25);
		m10 = (int) Math.floor(resto / 0.10);
		
		resto = (resto - m10 * 0.10);
		m05 = (int) Math.floor(resto / 0.05);
		
		resto = (resto - m05 * 0.05);
		m01 = (int) Math.round(resto / 0.01);
		
		System.out.println("NOTAS:");
		System.out.printf("%d nota(s) de R$ 100.00\n", n100);
		System.out.printf("%d nota(s) de R$ 50.00\n", n50);
		System.out.printf("%d nota(s) de R$ 20.00\n", n20);
		System.out.printf("%d nota(s) de R$ 10.00\n", n10);
		System.out.printf("%d nota(s) de R$ 5.00\n", n5);
		System.out.printf("%d nota(s) de R$ 2.00\n", n2);

		System.out.println("MOEDAS:");
		System.out.printf("%d moeda(s) de R$ 1.00\n", m1);
		System.out.printf("%d moeda(s) de R$ 0.50\n", m50);
		System.out.printf("%d moeda(s) de R$ 0.25\n", m25);
		System.out.printf("%d moeda(s) de R$ 0.10\n", m10);
		System.out.printf("%d moeda(s) de R$ 0.05\n", m05);
		System.out.printf("%d moeda(s) de R$ 0.01\n", m01);
	}
}