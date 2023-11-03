package com.xworkz.collecTest.runner;

public class SheepRunner {
	public static int count = 0;

	public static int checkSheep(Boolean[] sheep) {
		for (Boolean sheepTest : sheep) {
			if (sheepTest != null && sheepTest) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Boolean[] sheep = { true, true, true, false, true, true, true, true, true, false, true, false, true, false,
				false, true, true, true, true, false, false, true, true };
		int count = checkSheep(sheep);

		int entriesCount = sheep.length;
		System.out.println("Num of total sheep entries : " + entriesCount);

		System.out.println("Num of valid sheep entries : " + count);
		
	}

}
