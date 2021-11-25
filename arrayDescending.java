package javaassignments;
import java.util.Scanner;
public class arrayDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[5];   
		Scanner scan = new Scanner(System.in);  
		//accept the data and push it in an array   
		for(int i=0;i<5;i++)
		{   
			System.out.println("Enter an element ");   
			arr[i] = scan.nextInt();  
			}     
		//Sorting data....   //Bubble sort. 
	for(int i=0;i<4;i++)
	{   
		for(int j=i+1;j<5;j++)
		{     
			if(arr[i] > arr[j])
			{     
				int tmp = arr[i];     
				arr[i] = arr[j];     
				arr[j] = tmp; 
		}
	}
	}System.out.println("Elements in descending order");  
	//display elements in descending order  
	for(int i=4;i>=0;i--) 
	{   
		System.out.println(arr[i]);  
		}  
	}

}
