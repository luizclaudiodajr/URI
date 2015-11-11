package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int id, amount;
		double total;
		int i=1;
		
		final double price[]={4.0, 4.5, 5.0, 2.0, 1.5};
		
		Scanner input = new Scanner(System.in);
		
		id = input.nextInt();
		amount = input.nextInt();
		
		input.close();

		for(double cash:price){
			
			if(i==id){
				i++;
				total = amount* cash;
				System.out.printf("Total: R$ %.2f\n",total);
				break;
				
			}else{
				i++;
				continue;
			}
		}
	}
}