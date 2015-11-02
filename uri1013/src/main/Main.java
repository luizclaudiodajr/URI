package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int a, b, c, maior;
		
		Scanner input = new Scanner(System.in);
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		input.close();

		maior = (a+b+Math.abs(a-b))/2;
		maior = (maior+c+Math.abs(maior-c))/2;
		
		System.out.printf("%d eh o maior\n",maior);
	}
}