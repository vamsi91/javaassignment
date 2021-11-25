package javaassignments;

public class childoverload {
	//parent class
	void demo() {
		System.out.println("This is parent Class");
	}
	// extension of parent 
  }

class perfect extends childoverload{
	   //child method
		void demo( int x) {
			System.out.println("This is child Class");
		} 
		 //main mmethod
		public static void main(String[] args) {
			perfect p = new perfect();
			p.demo(5);
			
			
		}
}
