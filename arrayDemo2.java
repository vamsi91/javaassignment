 package javaassignments;

public class arrayDemo2 {
 int sum;
	public static void main(String args[]) {
	 int[] arr= {34,56,67,87,45,66,98};
	 arrayDemo2 ad= new arrayDemo2();
	int  total = ad.number(arr);
	System.out.println(total);

	}
	int number(int[] temp) {
		for(int x: temp) {
			sum = sum+ x;
		}
		return sum;
	}

}
