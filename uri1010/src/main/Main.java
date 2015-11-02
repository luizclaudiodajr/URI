package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int id1, npeca1, id2, npeca2;
		float  vpeca1, vpeca2, total;
		
		Scanner entrada = new Scanner(System.in);
		
		id1 = entrada.nextInt();
		npeca1 = entrada.nextInt();
		vpeca1 = entrada.nextFloat();
		
		id2 = entrada.nextInt();
		npeca2 = entrada.nextInt();
		vpeca2 = entrada.nextFloat();
		
		entrada.close();
		
		total = (npeca1*vpeca1)+(npeca2*vpeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
	}
}