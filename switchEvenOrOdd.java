package javaassignments;

import java.util.Scanner;
public class switchEvenOrOdd {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		 int num = scan.nextInt();
		 switch(num%2) {
		 case 0:
			 System.out.println("It is even number");
			 break;
		 case 1:
			 System.out.println("It is Odd number");
		 
		 }

	}

}
