package Revision;

import java.util.Arrays;

public class Revision1 {

	public static void main(String[] args) {


	int [] [] a= {{10,20},{30,40}};
	
	System.out.println(a.length);
	System.out.println(a[0].length);
	System.out.println(a[1].length);
		
	System.out.println(a+" "+a[0]+" "+a[1]);	
	
	System.out.println(a[0][1]);
	System.out.println(a[1][1]);	
		
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		
		for(int [] b:a)
		{
			for(int k:b)
			{
			System.out.print(k+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		int [] b= {1,4,3,5,6};
		
		
		int sum1=0;
		for(int i=0;i<b.length;i++)
		{
			sum1=sum1+b[i];
		}
		System.out.println(sum1);
		
		
		int sum2=0;
		for(int i=1;i<=6;i++)
		{
			
			sum2=sum2+i;
		}
		System.out.println(sum2);
		
		System.out.println("missing number is:"+(sum2-sum1));
		
		
		int even=0;
		int odd=0;
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println(even);
		System.out.println(odd);
		
		System.out.println(Arrays.toString(b));
		
		Arrays.sort(b);
		
		System.out.println(Arrays.toString(b));
		
		
		
		
	//finding largest number in array
		
		int max=b[0];
		int min=b[0];
		
		for(int i=1;i<b.length;i++)
		{
			if(b[i]>max)
			{
				max=b[i];
			}
			
			
		}
		
		for(int i=1;i<b.length;i++)
		{
			if(b[i]<min)
			{
				min=b[i];
			}
			
			
		}
		System.out.println(max);
		System.out.println(min);
		
		
	}
	

}
