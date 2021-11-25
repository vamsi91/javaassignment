package javaassignments;
 import java.util.Scanner;
public class functionExample2 {
	void greet(String data) {
		System.out.println(data);
		
	}
	int readInt(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.println(msg);
		int y = scan.nextInt();
		return y ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functionExample ex;
		ex = new functionExample();
		int num1 = ex.readInt("Enter First value");
		int num2 = ex.readInt("Enter Second value");
		ex.show("The result is "+ (num1+num2));
		}

}

