package javaassignments;

public class ageGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 12;
		if(age<=0)
		{
			System.out.println(age+" is invalid age");
		}
		else if( age>=1 && age<=12)
		{
			System.out.println(age+ " your agegroup is Kiddo");
			
		}
		else if(age>=13 && age<=19)
		{
			
			System.out.println(age+ " your agegroup is Teenager");
		}
		else if(age>=20 && age<=34)
		{
			System.out.println(age+ " your agegroup is Youth");
		}
		else if(age>=35 && age<=59)
		{
			System.out.println(age+ " your agegroup is Middle Age");
		}
		else if(age>=60 && age<=119)
		{
			System.out.println(age+ " your agegroup is Old Age");
		
		}
		else 
		{
			System.out.println("RIP");
		}
	}

}
