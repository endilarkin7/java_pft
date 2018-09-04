package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	public static void main (String[] args) {
		hello("Alex");
		String somebody = "world";
		System.out.println("Hello, " + somebody);
		double l = 8.0;
		double s = l * l;
		System.out.println("Площа квадрата зі стороною " + l + " = " + area(l));
	}
	public static void hello ( String somebody) {
		System.out.println("Hello " + somebody);
	}
	public static double area ( double len) {
		return len * len;
	}
	public  static double area (double a, double b) {
		return a * b;
	}
}
