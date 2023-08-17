package com.kn.forloop;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number=");
		int num = scan.nextInt();
//         int mul=1;
		for (int i = 1; i <= 10; i++) {
			int result = i * num;
			System.out.println(num + " * " + i + " = " + result);

		}
		scan.close();
	}

}
