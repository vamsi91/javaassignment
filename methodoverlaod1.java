package javaassignments;

public class methodoverlaod1 {
	//method1
	void add(int x,int y) {
		System.out.println("Result: "+ (x+y));
		
	}
	//method-2
	void add(int x, int y,int z ) {
		 System.out.println(" Result: "+ (x+y+z));
	}

	public static void main(String[] args) {
		//creating a object
		
		methodoverlaod1 ad = new methodoverlaod1();
      //passing a values in method using object reference 
		ad.add(3,4,6);
		ad.add(3,4);
	}

}
