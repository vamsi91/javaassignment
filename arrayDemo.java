package javaassignments;

public class arrayDemo {

	public static void main(String args[]) {
		
		int[] arr = {10,20,30,40,50,70};
		arrayDemo ad = new arrayDemo();
		ad.display(arr);
	}

	void display( int[] tmp) {
		for(int b: tmp) {
			System.out.println(b);
		}
	}
}
