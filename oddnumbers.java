package javaassignments;

public class oddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method 1
		//for(int j=1;j<100;j=j+2) {
		//	System.out.println(j);
		//}
		
		//method2
	//	for(int k=1;k<=100;k++) {
	//		if(k%2!= 0) {
		//		System.out.println(k);
		//	}
		//}
		
		//method3 using while loop

		int number=1;
		while(number<=100) {
			if(number %2 != 0) {
				System.out.println(number);
			}
			number++;
		}
	}

}
