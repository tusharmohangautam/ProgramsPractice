package Revision;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {

String s="welcome";
String s1="jAVAlan";
String s2="WELcome";
String s3="  welcome1  ";
String s5="This is real. This is good.";

System.out.println(s.length()+" "+s1.length());

System.out.println(s.concat(s1));
System.out.println("welcome".concat("java"));		
System.out.println(s.concat("javalan"));		
System.out.println("welcome".concat("java").concat("python"));		
	
System.out.println(s.charAt(5));
		
	boolean b=s.contains("elc")	;
	System.out.println(b);	
		
	System.out.println(s.equalsIgnoreCase(s2));	
	System.out.println(s.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s.substring(3,4));
		
		
		System.out.println(s3.length());
		String s4=s3.trim();
		System.out.println(s4.length());
		
		System.out.println(s.replace('w', 'z'));
		
		System.out.println(s5.replace("is", "was"));
		System.out.println(s5.replace(" ", "123"));
		
		
		String s6="abc@gmail.com";
		String [] a=s6.split("@");
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]+" "+a[1]);
		
		String s7="abc,123@gmail.com";
	String [] c=	s7.split(",");
		System.out.println(Arrays.toString(c));
		System.out.println(c[0]);
		System.out.println(c[1]);
		String [] d=c[1].split("@");
		
		System.out.println(Arrays.toString(d));
		System.out.println(d[0]);
		System.out.println(d[1]);
		
		
		String s8="123 456 789";
		String [] e=s8.split(" ");
		
		System.out.println(Arrays.toString(e));
		System.out.println(e[0]);
		System.out.println(e[1]);
		System.out.println(e[2]);
		
		System.out.println(s.toLowerCase().contains("WELC"));
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
			
		}
		System.out.println(rev);
		
		
		char [] ch=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
			
		}
		System.out.println(rev);
		
		
		StringBuffer z=new StringBuffer("welcome");
		
		System.out.println(z.reverse());
		
		StringBuilder x=new StringBuilder("welcomehome");
		
		System.out.println(x.reverse());
		
		z.append("java");
		System.out.println(z);
		
		s.concat("dear");
		System.out.println(s);
		
		
		
		
		String r="w   e  l c  o   m  e";
		System.out.println(r.replace(" ", ""));
		
		
		
	}

}
