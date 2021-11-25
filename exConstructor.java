package javaassignments;

public class exConstructor {
 int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exConstructor  s1 = new exConstructor();
		s1.display();
		
	}
	
	 exConstructor(){
		 a= 10;
	}
	 void display() {
		 System.out.println(a);
	 }

}
