package org.java.shop;

import java.util.Scanner;

import org.java.products.Cuffia;
import org.java.products.Prodotto;
import org.java.products.Smartphone;
import org.java.products.Televisore;

public class Catalogo {

	public static void main(String[] args) {


		System.out.println("Inserisci Prodotti a catalogo");
		
		Prodotto[] catalogue = new Prodotto[100];
		int index = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Che tipo di prodotto vuoi inserire?");
			System.out.println("[S]martphone");
			System.out.println("[T]elevisore");
			System.out.println("[C]uffia");
			System.out.println("[E]sci");
			
			String userInput = sc.nextLine();
			
			if(userInput.equalsIgnoreCase("e")) {
				sc.close();
				break;
			}
			
			System.out.println("Nome prodotto:");
			String name = sc.nextLine();
			System.out.println("Marca prodotto:");
			String brand = sc.nextLine();
			System.out.println("Prezzo prodotto:");
			double price = sc.nextDouble();
			sc.nextLine();
			System.out.println("IVA prodotto:");
			int vat = sc.nextInt();
			sc.nextLine();
			
			switch(userInput.toLowerCase()) {
				
			 case "s": 
				 	System.out.println("Imei prodotto:");
					long imei = sc.nextLong();
					sc.nextLine();
					System.out.println("Memoria prodotto:");
					String memory = sc.nextLine();
					Smartphone smartphone = new Smartphone(name, brand, price, vat, imei, memory);
					catalogue[index] = smartphone;
					index++;
					break;
			 case "t": 
				 	System.out.println("Pollici prodotto:");
					double dimension = sc.nextDouble();
					sc.nextLine();
					System.out.println("Il prodotto è smart?");
					boolean smart = sc.nextBoolean();
					sc.nextLine();
					Televisore televisore = new Televisore(name, brand, price, vat, dimension, smart);
					catalogue[index] = televisore;
					index++;
					break;
			 case "c": 
				 	System.out.println("Colore prodotto:");
					String color = sc.nextLine();
					System.out.println("Il prodotto è wireless?");
					boolean wireless = sc.nextBoolean();
					sc.nextLine();
					Cuffia cuffia = new Cuffia(name, brand, price, vat, color, wireless);
					catalogue[index] = cuffia;
					index++;
					break;
			default:
					System.out.println("Prodotto non valido");
			}
			
			
			
		}
		
		if (index > 0) {
			System.out.println("\n------------------------\n");
			System.out.println("       CATALOGO         ");
			System.out.println("\n------------------------\n");
			for (int i = 0; i<catalogue.length; i++) {
				if(catalogue[i] != null) {
					System.out.println(catalogue[i]);
					System.out.println("\n------------------------\n");
				}
			}
		}

	}

}
