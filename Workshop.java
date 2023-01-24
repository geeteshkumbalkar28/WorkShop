//Program to find largest element of an array
//Program to find smallest number in an array



import java.util.*;

public class Workshop 
{
	int arr[];
	public static void main(String arg[])
	{
		Workshop obj = new Workshop();
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Enter the array size");
		int arrSize = scan.nextInt();
		
		obj.accept(arrSize);
		System.out.println("Display :");
		obj.display();
		int iAns = obj.largest();
		System.out.println("Largest number is:"+iAns);
		iAns = obj.smallest();
		System.out.println("smallest number is:"+iAns);
		
	}
	public void accept(int size)
	{
		Scanner scanOne = new Scanner(System.in);
		arr = new int[size];
		for(int counter=0; counter<size;counter++)
		{
			arr[counter] = scanOne.nextInt(); 
		}
	}
	public int largest()
	{
		int max=arr[0];
			
		for(int counter=1; counter<arr.length;counter++)
		{
			if(max<arr[counter])
			{
				max = arr[counter];
			}
		}
		return max;
	}
	public int smallest()
	{
		int min=arr[0];
			
		for(int counter=1; counter<arr.length;counter++)
		{
			if(min>arr[counter])
			{
				min = arr[counter];
			}
		}
		return min;
	}
	public void display()
	{
		for(int counter=0;counter<arr.length;counter++)
		{
			System.out.println(arr[counter]);
		}
	}
	
	
}
