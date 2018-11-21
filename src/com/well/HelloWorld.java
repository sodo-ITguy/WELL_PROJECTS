package com.well;

import java.util.Scanner;

// OOP: Object Oriented Programming Language
// everything is object

// James Gosling 1992? C language: C++ : intel Bell lab

public class HelloWorld {
		
	String adam;
	String eve;
	
	public static void main(String[] args) {
		System.out.println("In the beginning there was nothing but word");
		System.out.println("And GOD said that there be light!");
		System.out.println("And there is light!");
		System.out.println("And GOD also said ...");
		System.out.println("Pleaes type what GOD said:");
		Scanner scanner = new  Scanner(System.in);
		while(scanner.hasNext()) {
			String next = scanner.nextLine();
//			if(next.equalsIgnoreCase("light")) {
				System.out.println("And there was " + next + "!");
//			}
		}
	}
	
	public String print() {
		return "Printing";
	}
	
}