package javaassignments;

public class student2 {
	int rollno;
	String name;
	String branch;
	public static void main(String[] args) {
		// creating a object
		 student2 s1 = new student2(104,"vamsi krishna"," ECE");
		 student2 s2 = new student2("MECH");
		 student2 s3 = new student2(106,"Priyanka");
	}
	student2(int x, String n){
		 rollno =x ;
		 name = n;
		 System.out.println(" Name: " + name+ "\n"+ " Roll no: "+ rollno);
	}
	student2(String b){
		branch= b;
		System.out.println(branch);
	}
	student2(int x, String n, String b){
		rollno =x;
		name = n;
		branch = b;
		System.out.println(  " Roll no: "+ rollno + "\n"+ " Name: " + name + "\n"+ " Branch : " +  branch );
	}

}
