package javaassignments;

public class exthiskeyword {
	//instance variable 
	int x;
	 exthiskeyword(int x ){
		  this.x = x;
	 }
	void display() {
		
		System.out.println(this.x);
	}

	public static void main(String[] args) {
	
		exthiskeyword stu = new exthiskeyword(60);
		stu.display();
	}

}
