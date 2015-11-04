package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int n, hora, minuto, segundo, time;
	
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		
		input.close();
		
		hora = (int)Math.floor(n/3600);
		
		time = (n-hora*3600);
		minuto = (int)Math.floor(time/60);
		
		segundo = (int)Math.floor(time-minuto*60);
		
		System.out.printf("%d:%d:%d\n",hora,minuto,segundo);
	}
}