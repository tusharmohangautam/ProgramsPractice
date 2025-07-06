package Revision;

public class PatterDemo {

	public static void main(String[] args) {

// solid rectangle
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println(".............");
		
for(int i=1;i<=4;i++)		
{
	for(int j=1;j<=5;j++)
	{
		if(i==1 || i==4 || j==1 || j==5)
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");
		}
		
	}
	System.out.println();
}
		
		
		
		
	//half pyramid

for(int i=1;i<=4;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
		
		
System.out.println(".............");
System.out.println(".............");
System.out.println(".............");

for(int i=4;i>=1;i--)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}



for(int i=1;i<=4;i++)
{
	for(int j=1;j<=4-i;j++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
	
}

int number=1;
for(int i=1;i<=5;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(number+" ");
		number++;
	}
	System.out.println();
}



		
for(int i=1;i<=5;i++)
{
	for(int j=1;j<=i;j++)
	{
		int sum=i+j;
		if(sum%2==0)
		{
			System.out.print("1"+" ");
		}
		else
		{
			System.out.print("0"+" ");
		}
		
		
	}
	System.out.println();
	
}




System.out.println();
System.out.println(".............");
System.out.println(".............");
System.out.println(".............");
System.out.println(".............");
System.out.println(".............");


for(int i=1;i<=4;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	int spaces=2*(4-i);
	for(int j=1;j<=spaces;j++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=1;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}















		
		

	}

}
