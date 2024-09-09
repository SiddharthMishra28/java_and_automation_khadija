package com.java.oop.polymorphism;

public class GeometricUtils {
	
	int length;
	int width;
	
	public double calcAreaTriangle() {
		return 0.5 * length * width;
	}
	
	public double calcAreaSquare() {
		return length * length;
	}
	
	public double calcAreaRectangle() {
		return length * width;
	}
}
