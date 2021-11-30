package javaTasks;

import java.util.Scanner;

public class Arthmetics {
	void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number");
		int c= scan.nextInt();
		System.out.println("Enter second number");
		int d = scan.nextInt();
		System.out.println("The sum is "+ (c+d));
	}
	
	void sub() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number");
		int c= scan.nextInt();
		System.out.println("Enter second number");
		int d = scan.nextInt();
		System.out.println("The substraction is "+ (c-d));
	}
	void mul() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number");
		int c= scan.nextInt();
		System.out.println("Enter second number");
		int d = scan.nextInt();
		System.out.println("The multiplication is "+ (c*d));
	}
	void div() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number");
		int c= scan.nextInt();
		System.out.println("Enter second number");
		int d = scan.nextInt();
		System.out.println("The division is "+ (c/d));
	}



	public static void main(String[] args) {
		
		 Arthmetics  ar = new   Arthmetics();
		 ar.add();
		 ar.sub();
		 ar.mul();
		 ar.div();
	}

}
