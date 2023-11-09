package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		// call out scanner
		Scanner in = new Scanner(System.in);
		
		// Standard price 
		final double PRICE_KM = 0.21;
		
		//Kilometers to do 
		System.out.print("Inserisci la distanza da percorre:");
		int distance = Integer.valueOf(in.nextLine());
		
		//User age
		System.out.print("Inserisci la tua eta:");
		int userAge = Integer.valueOf(in.nextLine());
		
		// standard price
		double standardPrice = distance * PRICE_KM;
		
		
		
		
		// stop scanner
		in.close();
	}

}
