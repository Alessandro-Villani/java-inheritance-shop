package org.java.shop;

import java.util.Random;

public class Prodotto {

	private int code;
	private String name;
	private String brand;
	private float price;
	private int vat;
	
	
	public Prodotto(String name, String brand, float price, int vat) {
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


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
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
	
	public float getVatPrice() {
		return getPrice() * (1 + getVat()/100);
	}
	
	protected String productString() {
		return "Codice Prodotto: " + getCode() + ", Nome: " + getName() + ", Marca: " + getBrand() + "\nPrezzo: " +  getPrice() + ", iva: " + getVat() + "% \nPrezzo ivato" + getVatPrice();
	}
	
	@Override
	public String toString() {
		return "[P]" + productString(); 
	}
	
	
}