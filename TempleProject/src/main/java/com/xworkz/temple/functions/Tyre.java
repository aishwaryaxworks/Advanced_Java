package com.xworkz.temple.functions;

@FunctionalInterface
public interface Tyre {
	double getPrice(String brand, int size, String type);
}
