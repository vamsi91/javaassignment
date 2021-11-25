package javaassignments;
import java.util.Scanner;

public class functionExample {
 void show(String data) {
	 System.out.println(data);
 }
	
int readInt(String msg) 
{
Scanner scan= new Scanner(System.in);
System.out.println(msg);
int x= scan.nextInt();
return x;
}
	public static void main(String args[]) {
		//object declaration
		functionExample ex;
		//object installation
		ex = new functionExample();
		int num1 = ex.readInt("Enter the first value");
		int num2 = ex.readInt("Enter the second value");
		ex.show("The result is "+(num1+num2));
	}

}