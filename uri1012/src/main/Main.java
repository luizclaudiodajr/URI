package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double A, B, C, TRIANGULO, CIRCULO,	TRAPEZIO, QUADRADO,	RETANGULO;
		final double pi = 3.14159;
		
		Scanner entrada = new Scanner(System.in);
		
		A = entrada.nextDouble();
		B = entrada.nextDouble();
		C = entrada.nextDouble();
		
		entrada.close();
		
		TRIANGULO = (A*C)/2;
		CIRCULO = pi * Math.pow(C,2);
		TRAPEZIO = ((A+B)*C)/2;
		QUADRADO = Math.pow(B,2);
		RETANGULO = A*B;
		
		System.out.printf("TRIANGULO: %.3f\n",TRIANGULO);
		System.out.printf("CIRCULO: %.3f\n",CIRCULO);
		System.out.printf("TRAPEZIO: %.3f\n",TRAPEZIO);
		System.out.printf("QUADRADO: %.3f\n",QUADRADO);
		System.out.printf("RETANGULO: %.3f\n",RETANGULO);
	}
}