package com.cgi.formula;

public class Area {

	public double areaOfCircle(double r) {
		return 3.14 * r * r;
	}

	public static double areaOfRectangle(double length, double width) {
		return length * width;
	}

	public String getAuthorName() {
		return "Balaji Dinakaran";
	}

	public static void quit() {

	}

	public static double areaOfTriangle(double base, double height) {
		return (base * height) / 2;
	}
}
