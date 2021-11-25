package javaassignments;

import java.util.Scanner;
public class sumofEvennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numbers[] = new int[10];
		int x=0,even=0,odd=0;
		for( x=0;x<10;x=x+1) {
			numbers[x] = scan.nextInt();
			if(numbers[x]%2==0) {
				even = even+numbers[x];
			}else {
				odd = odd+numbers[x];
			}
		}
		System.out.println("Sum of even numbers = "+even);
		System.out.println("Sum of odd numbers = "+ odd );
		int diff =  even-odd;
		System.out.println("Difference between even and odd is  "+ diff);

	}

}
