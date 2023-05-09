package org.java.products;

import java.util.Random;

public class Prodotto {

	private int code;
	private String name;
	private String brand;
	private double price;
	private int vat;
	
	
	public Prodotto(String name, String brand, double price, int vat) {
		Random rnd = new Random();
		code = rnd.nextInt();
		setName(name);
		setBrand(brand);
		setPrice(price);
		setVat(vat);
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getVat() {
		return vat;
	}


	public void setVat(int vat) {
		this.vat = vat;
	}


	public int getCode() {
		return code;
	}
	
	public double getVatPrice() {
		double vat = getPrice() * getVat()/100;
		return getPrice() + vat;
	}
	
	protected String productString() {
		return "Codice Prodotto: " + getCode() + ", Nome: " + getName() + ", Marca: " + getBrand() + "\nPrezzo: " +  getPrice() + "€, iva: " + getVat() + "% \nPrezzo ivato: " + getVatPrice() + "€\n";
	}
	
	@Override
	public String toString() {
		return "[P]" + productString(); 
	}
	
	
}
