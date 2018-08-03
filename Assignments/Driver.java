package com.revature.assignments;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter type");		
		String type = sc.next();
		System.out.println("Enter operation");
		String operation = sc.next();
		System.out.println("Enter first number");
		String num1 = sc.next();
		System.out.println("Enter second number");
		String num2 = sc.next();
		
		ScannerCalculator.calculate(type, operation, num1, num2);
	}

}