package javaassignments;

public class primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int i, j,number;
	for(i=2;i<=100;i++)
	{ 
		number =0;
		for(j=2;j<i;j++)
		{
			if(i % j == 0)
			{
				number++;
			}
		}
		
		if(number == 0)
		{
			System.out.print(i + "  ");
		}
	}
		
		
	}

}
