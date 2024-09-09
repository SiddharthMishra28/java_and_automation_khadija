package com.java.oop.polymorphism;

public class ThreeDimensionalUtils extends GeometricUtils {
	
	int height;
	
	public double calcSurfaceAreaSphere() {
		return 4 * 3.14 * length * length;
	}
	
	// Method Overriding
	public double calcAreaTriangle(float errMargin) {
		return 0.5 * length * width * errMargin;
	}
	
	public static void main(String[] args) {
		ThreeDimensionalUtils utils = new ThreeDimensionalUtils();
		utils.width = 12;
		utils.length = 6;
		System.out.println(utils.calcAreaTriangle(0.3f)); // Polymorphism
	}
}
