package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int id, horas;
		double valorHora, salario;

		Scanner entrada = new Scanner(System.in);

		id = entrada.nextInt();
		horas = entrada.nextInt();
		valorHora = entrada.nextDouble();

		entrada.close();

		salario = horas * valorHora;

		System.out.printf("NUMBER = %d\n", id);
		System.out.printf("SALARY = U$ %.2f\n", salario);
	}
}