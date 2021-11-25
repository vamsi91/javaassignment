package javaassignments;

public class objectParameter {

 int sum;
	public static void main(String[] args) {
		student s1 = new student();
		objectParameter od = new objectParameter();
		int total = od.display(s1);
		System.out.println("Total numner of marks is "+total);

	}
	int display(student s3 ) {
		  sum = s3.biology + s3.english+ s3.maths+ s3.telugu + s3.sanscrit ;
		  return sum;
	}

	

}
