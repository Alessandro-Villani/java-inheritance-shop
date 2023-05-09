package org.java.products;

public class Televisore extends Prodotto {
	
	private double dimension;
	private boolean smart;

	public Televisore(String name, String brand, double price, int vat, double dimension, boolean smart) {
		super(name, brand, price, vat);
		setDimension(dimension);
		setSmart(smart);
	}

	public double getDimension() {
		return dimension;
	}

	public void setDimension(double dimension) {
		this.dimension = dimension;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	@Override
	public String toString() {
		String isSmart = this.isSmart() ? "Si" : "No"; 
		return "[TELEVISORE]" + super.toString() + "Pollici: " + getDimension() + "Smart: " + isSmart;
	}

}
