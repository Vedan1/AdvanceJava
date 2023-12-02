package com.springCdac;

import org.springframework.stereotype.Component;

@Component
public class Tyres {

	private String Brand;
	private String Terrain;
//	public Tyres(String Terrain) {
//		this.Terrain=Terrain;
//	}
	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	@Override
	public String toString() {
		return "Tyres [Brand=" + Brand + ", Terrain=" + Terrain + "]";
	}
	
	
}
