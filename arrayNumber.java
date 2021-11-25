package javaassignments;

import java.util.Scanner;
public class arrayNumber {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int numbers[] = new int[10];
	int sum=0,i=0;
	for( i=0;i<10;i=i+1) {
		System.out.println("Enter your number");
		numbers[i] = scan.nextInt();
		sum= sum+numbers[i];
	}
	System.out.println( "Sum of total marks are "+ sum);
	float avg = sum /(1.0f*i);
	System.out.println("Average of the numbers is "+ avg);

	}

}
