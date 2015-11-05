package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		int A, B, C, D;
		String msg;
		
		Scanner input = new Scanner(System.in);
		
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		D = input.nextInt();
		
		input.close();
		
		msg = ((B>C)&&(D>A)&&((C+D)>(A+B))&&(C>0)&&(D>0)&&(A%2==0))?"Valores aceitos":"Valores nao aceitos";
		
		System.out.println(msg);
	}
}