package com.qa.interfaces;

public class Clothes {
	
	String sizeTshirt;
	int shoeSize;
	String colour;
	String brand;
	String material;
	
	public Clothes(String sizeTshirt, int shoeSize, String colour, String brand, String material) {
		this.sizeTshirt = sizeTshirt;
		this.shoeSize = shoeSize;
		this.colour = colour;
		this.brand = brand;
		this.material = material;
	}
	
	public Clothes(String sizeTshirt, int shoeSize, String colour) {
		this.sizeTshirt = sizeTshirt;
		this.shoeSize = shoeSize;
		this.colour = colour;
	}

	public Clothes() {
		
	}


	public String getSizeTshirt() {
		return sizeTshirt;
	}

	public void setSizeTshirt(String sizeTshirt) {
		this.sizeTshirt = sizeTshirt;
	}

	public int getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(int shoeSize) {
		this.shoeSize = shoeSize;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	

}
