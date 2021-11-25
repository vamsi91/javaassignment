package javaassignments;

public class stingCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mystr1 = "pradeep";
		String mystr2 = "Pradeep";
		String mystr3 = "pradeepchandra";
		String mystr4 = "PRADEEPCHANDRA";
		System.out.println(mystr1.compareTo(mystr2)); 
		System.out.println(mystr1.compareTo(mystr3)); 
		System.out.println(mystr1.compareTo(mystr4)); 
		System.out.println(mystr2.compareTo(mystr3)); 
		System.out.println(mystr2.compareTo(mystr4));
		System.out.println(mystr3.compareTo(mystr4)); 
	}

}
