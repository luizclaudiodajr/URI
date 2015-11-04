package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int ndias, ano, mes, dia;
		final int oneYear = 365;
		final int oneMonth = 30;
		
		Scanner input = new Scanner(System.in);
		
		ndias = input.nextInt();
		
		input.close();
		
		ano = ndias/oneYear;
		
		mes = (ndias-ano*oneYear)/oneMonth;
		
		dia = (ndias-ano*oneYear-mes*oneMonth);
	
		System.out.printf("%d ano(s)\n",ano);
		System.out.printf("%d mes(es)\n",mes);
		System.out.printf("%d dia(s)\n",dia);
	}
}