package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		// call out scanner
		Scanner in = new Scanner(System.in);
		
		// Standard price 
		final double PRICE_KM = 0.21;
		int underAge = 18;
		int over65 = 65;
		//Kilometers to do 
		System.out.print("Inserisci la distanza da percorre:");
		int distance = Integer.valueOf(in.nextLine());
		
		//User age
		System.out.print("Inserisci la tua eta:");
		int userAge = Integer.valueOf(in.nextLine());
		
		//standard price
		double standardPrice = distance * PRICE_KM;
		double discount = 0;
		//discount condition
		if (userAge < underAge) {
			discount = standardPrice * 0.20;
		}
		else if (userAge > over65){
			discount = standardPrice * 0.40;
		}
		
		double discountedPrice = standardPrice - discount;
		
		System.out.println((userAge < underAge) ? discountedPrice : ((userAge > over65) ? discountedPrice : standardPrice));
		
		
		// stop scanner
		in.close();
	}

}
