package com.kn.forloop;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("enter the range=");
		int num = read.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = i + sum;

		}

		System.out.println("sum of" + num + " natural number is" + sum);
		read.close();
	}

}
