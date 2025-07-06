package mayRevision;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ProgramRevise1 {
	
	
	static void sum(int... a)
	
	{
		int total =0;
		for(int a1:a)
		{
			total=total+a1;
		}
		System.out.println(total);
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) throws UnknownHostException {


	System.out.println("hi this is revision clas...");	
		
	// ascending integers
	for(int i=1;i<=10;i++)
	{
		System.out.print(i+" ");
	}
	
	System.out.println();
	
	// descending integers
	
	for(int i=10;i>=1;i--)
	{
		System.out.print(i+" ");
	}
		
	System.out.println();
	
	// command line arguments
	
	//String [] argh= {"100","abc","a","100.34"};
		
		//args=argh;
		
		for(int i=0;i<args.length;i++)
		{
			System.out.print(args[i]+" ");
		}
		
		System.out.println();
		//System.out.println(args[2]);
		
		
	/*	int a=10,b=20,c;
		c=a;
		a=b;
		b=c;
		System.out.println(a+" "+b);  */
		
		
		sum();
		sum(10,20);
		sum(10,20,30);
		
		/*taking input from user program
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entering first number...");
		
		int a=sc.nextInt();
		
		System.out.println("entering second number....");
		
		int b=sc.nextInt();
		
		int c= a%b;
		
		System.out.println(" a div by b is:" + c); */
		
		
		// find largest number program
		
	/*	int a=10,b=20,c=30;
		
		if(a>b && a>c)
		{
			System.out.println("a is greatest");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greatest....");
		}
		
		else
		{
			System.out.println("c is greatest....");
		}*/
		
		// if-else clause
		
		int day=10;
		
		if(day==1)
		{
			System.out.println("monday..");
		}
		else if(day==2)
		{
			System.out.println("tuesday...");
		}
		else if(day==3)
		{
			System.out.println("wednesday....");
		}
		else if(day==4)
		{
			System.out.println("thrusday...");
		}
		
		else if(day==5)
		{
			System.out.println("friday");
		}
		else if(day==6)
		{
			System.out.println("saturday...");
		}
		
		else
		{
			System.out.println("sunday...");
		}
		
		
		// nested if-else
		
		boolean b=false;
		
		if(b)
		{
			if(5>1 && 5>2)
			{
				System.out.println("condition true....");
			}
		}
		
		else
		{
			System.out.println("....");
		}
		
		
		// odd and even number program
	/*	int a=10;
		if(a%2==0)
		{
			System.out.println("a is a even number...");
		}
		else if(a%2!=0)
		{
			System.out.println("a is a odd number..");
		}
		
		else
		{
			System.out.println(" a is neither even nor odd...");
		}
		*/
		
		
		// compare two strings program
		
	/*	String s1="welcome";
		String s2=new String("Welcome");
		
		System.out.println(s1.equalsIgnoreCase(s2));  */
		
		
		// simple for loop program in java
		
		for(int i= 20;i>=1;i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		// while loop program
		
		/*int a=10;
		
		while(a>=1)
		{
			System.out.print(a+" ");
			a--;
		}
		System.out.println(); */
		
		
		// while loop using continue
		
		int aa=1;
		
		while(aa<=10)
		{
			
			System.out.print(aa+" ");
			aa++;
		}
		System.out.println();
		
		
		
		// print ascending alphabets using for loop
		for(char ch='a';ch<='z';ch++)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
		
		
		// reverse alphabets
		for (char ch='z';ch>='a';ch--)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
		
		
		for(String x:args)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		
		// multiplication using Scanner class
		
/*		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number....");
		int a=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.print(a*i+" ");
		}
		
		System.out.println(); */
		
		
		// tables from 1-10 using while loop
		
	/*	int a=1;
		while(a<=10)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.print(a*i+" ");
			}
			System.out.println();
			a++;
		}
		System.out.println();
		
		*/
		
		System.out.println("------------------------------------");
		
		
		// tables from 1-10 using do while loop
		
		int a=1;
		do
		{
			System.out.println("");
			for(int i=1;i<=10;i++)
			{
				System.out.print(a*i+" ");
			}
			System.out.println();
			a++;
		}while(a<=10);
		
		
		// prime number program
		
	/*	int c=9;
		
		int count=0;
		
		for(int i=1;i<=7;i++)
		{
			if(c%i==0)
			{
				count++;
			}
			System.out.println();
		}
		
		if(count==2)
		{
			System.out.println("c is a prime number....");
		}
		else
		{
			System.out.println("c is not a prime number....");
		}
		
		*/
		
		
		// print reverse string
		
		// 1st approach using for loop
		
/*		String s="welcome";
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
			
		}
		
		System.out.println("reverse string is:"+s1);
*/		
		
		// converting string into char array to print reverse string
		
		
/*		String s="welcome";
		String s1="";
		
		
		char [] ch=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			s1=s1+ch[i];
			
		}
		
		System.out.println(s1);
*/		
		
		
		// using String Buffer class
		
	/*	StringBuffer s=new StringBuffer("welcometmg");
		
		System.out.println(s.reverse());
	
		StringBuilder s1=new StringBuilder("bytheway");
		System.out.println(s1.reverse());  */
		
		
		// how to get own ip address
		
		System.out.println(InetAddress.getLocalHost());
		
		
		
		Runtime rs=Runtime.getRuntime();
		
		try {
			rs.exec("notepad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
