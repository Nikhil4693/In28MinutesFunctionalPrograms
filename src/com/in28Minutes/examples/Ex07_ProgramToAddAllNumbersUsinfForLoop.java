package com.in28Minutes.examples;

import java.util.Arrays;
import java.util.List;

public class Ex07_ProgramToAddAllNumbersUsinfForLoop {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 23, 56, 21, 25, 46, 89, 100);

		// from here we will serially go down ward to get concept
		int sum = printAllNumbersRegularly(numbers);
		System.out.println(sum);
	}

	private static int printAllNumbersRegularly(List<Integer> asList) {
		int sum = 0;

		for (int num : asList)
			sum = sum + num;
		return sum;
	}
}