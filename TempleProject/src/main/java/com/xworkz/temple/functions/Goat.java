package com.xworkz.temple.functions;

@FunctionalInterface
public interface Goat {
	boolean alive();
	default void run() {
		System.out.println("run in goat interface...");
	}
}
