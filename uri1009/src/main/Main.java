package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		String nome;
		Double salario, venda, salarioTotal;
		
		final Double comissao = 0.150;
		
		Scanner entrada = new Scanner(System.in);
		
		nome = entrada.nextLine();
		salario = entrada.nextDouble();
		venda = entrada.nextDouble();
		
		entrada.close();
		
		salarioTotal = salario + venda*comissao;
		
		System.out.printf("TOTAL = R$ %.2f\n",salarioTotal);
	}
}