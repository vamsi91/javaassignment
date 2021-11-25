package javaassignments;
 import java.util.Scanner;
public class countEvennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int numbers[]= new int[15];
		int even = 0;
		int odd = 0;
		for(int j=0;j<15;j=j+1) {
			System.out.println("Enter Your number");
			numbers[j]= scan.nextInt();
			if(numbers[j]%2 == 0) {
				even= even+1;
				}else {
					odd= odd+1;
				}
		}
		System.out.println("Count of even numbers is " + even);
		System.out.println("Count of odd numbers is " + odd);
	}

}
