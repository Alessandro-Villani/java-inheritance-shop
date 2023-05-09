package org.java.shop;

import org.java.products.Cuffia;
import org.java.products.Smartphone;
import org.java.products.Televisore;

public class Shop {

	public static void main(String[] args) {


		Smartphone smartphone1 = new Smartphone("Pixel 7", "Google", 800.00, 22, 1234567890, "32GB");
		System.out.println(smartphone1);
		System.out.println("\n---------------------------------\n");
		Televisore televisore1 = new Televisore("G1", "Samsung", 1000.00, 22, 60, false);
		System.out.println(televisore1);
		System.out.println("\n---------------------------------\n");
		Cuffia cuffia1 = new Cuffia("G733", "Logitech", 120.00, 22, "Nero", true);
		System.out.println(cuffia1);
		System.out.println("\n---------------------------------\n");
	}

}
