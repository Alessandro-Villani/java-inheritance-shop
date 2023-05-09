package org.java.products;

public class Smartphone extends Prodotto {
	
	private long imei;
	private String memory;

	public Smartphone(String name, String brand, double price, int vat, long imei, String memory) {
		
		super(name, brand, price, vat);
		setImei(imei);
		setMemory(memory);
		
	}

	public long getImei() {
		return imei;
	}

	public void setImei(long imei) {
		this.imei = imei;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}
	
	@Override
	public String toString() {
		return "[SMARTPHONE] " + super.productString() + "Imei: " + getImei() + ", Memoria: " + getMemory();
	}

}
