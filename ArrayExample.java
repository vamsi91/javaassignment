package javaassignments;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = {67,89,77,79,50,80};
		int x= 0;
		int sum = 0;
		do {
			System.out.println(marks[x]);
			sum= sum+marks[x];
			x= x+1;
		}while(x<5);
		System.out.println( "Sum of total marks are "+ sum);
		
		float avg = sum /6.0f;
		System.out.println("Average of the marks is "+ avg);
	}

}
