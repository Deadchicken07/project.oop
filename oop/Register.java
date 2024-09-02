package project.oop;

import java.util.Scanner;
public class Register {
	public static void main(String[] args) {
	boolean check = true ;
	do {
		int countBigLetter = 0;
		int countLetter = 0 ;
		
		Scanner objScanner = new Scanner(System.in);
		
		System.out.println("Register");
		System.out.print("UserName : ");
		String rgtUsername = objScanner.nextLine();
		
		if (rgtUsername.indexOf('b') != 0 || rgtUsername.length() != 11) {
			System.out.println("Try again Username Start With b and ");
			continue;
		}
		
		System.out.print("Password : ");
		
		String rgtPassword = objScanner.nextLine();
		
		for (char i : rgtPassword.toCharArray()) {
			if (i > 'A' && i < 'Z') {
				countBigLetter++;
				countLetter++;
			}
			if (i > 'a' && i <'z') {
				countLetter++;
			}
		}
		
		if (countLetter < 3 || countBigLetter < 1) {
			System.out.println("3 Letter and 1 BigLetter");
			continue;
		}
		
		System.out.print("Confirm Password : ");
		
		String conrgtPassword = objScanner.nextLine();
		
		if (!rgtPassword.equals(conrgtPassword)) {
			System.out.println("Your password it's not equal");
			continue;
		}
		
		System.out.println("Name : ");
		
		String name = objScanner.nextLine();
		
		System.out.println("Surname");
		
		String surName = objScanner.nextLine();
		
		Student testStudent = new Student(rgtUsername, conrgtPassword, name, surName, rgtUsername.substring(1,11));	
		
		//test ;
		System.out.println(testStudent.getNisitCode());
	}while(check);	
  }	
}
