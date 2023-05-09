package org.java.products;

public class Cuffia extends Prodotto {
	
	private String color;
	private boolean wireless;

	public Cuffia(String name, String brand, double price, int vat, String color, boolean wireless) {
		
		super(name, brand, price, vat);
		setColor(color);
		setWireless(wireless);
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	@Override
	public String toString() {
		String isWireless = this.isWireless() ? "Si" : "No"; 
		return "[CUFFIA]" + super.productString() + ", Colore: " + getColor() + ", Wireless: " + isWireless;
	}

}
