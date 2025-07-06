package Revision;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Program1 {

	
	
	
	public static void main(String [] args)
	{
		
		
		// one dimensional array
		
		int [] a= {10,31,10,40,61,70,10,51,10};
		
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		//Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println(a[3]);
		
		for(int i=0;i<=5;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();	
			
			
			for(int x:a)
			{
				System.out.print(x+" ");
			}
			
			System.out.println();
			
			
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				count=count+a[i];
			}
			System.out.println("sum of array is:"+ count);
		
			
			
		for(int i=0;i<a.length;i++)	
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+" ");
			}
				
		}
			
		System.out.println();	
			
			
			
			for(int odd:a)
			{
				if(odd%2!=0)
				{
					System.out.print(odd+" ");
				}
				
			}
			System.out.println();
			
			
			boolean b=false;
			int searchnum=31;
			for(int i=0;i<a.length;i++)
			{
				if(searchnum==a[i])
				{
					System.out.println("element founded..");
					b=true;
					break;
				}
				
				
			}
			
			if(b==false)
			{
				System.out.println("element not found..");
			}
			
			int snum=10;
			int count1=0;
			
			for(int i=0;i<a.length;i++)
			{
				if(snum==a[i])
				{
					count1++;
				}
				
				
			}
			
			System.out.println(count1);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	

