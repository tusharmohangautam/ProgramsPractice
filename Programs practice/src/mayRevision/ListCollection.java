package mayRevision;

import java.util.ArrayList;
import java.util.Iterator;

public class ListCollection {

	public static void main(String[] args) {


		// ArrayList al=new ArrayList();
		//ArrayList <Integer> al=new ArrayList<Integer>;
		//list al =new ArrayList();
		// List <Integer> al=new ArrayList<Integer> ();
		
		ArrayList al=new ArrayList();
		
		al.add(100);
		al.add("monkey");
		al.add(null);
		al.add("hundred");
		al.add('a');
		al.add(null);
		al.add(2000);
		
		System.out.println(al.size());
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		
		al.add(2,"janeman");
		System.out.println(al);
		
		al.set(2, "bahadurrr");
		System.out.println(al);
		
		System.out.println(al.get(3));
		
		
		
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}
		
		System.out.println();
		
		
		
		for(Object x:al)
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		
		
		Iterator it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		
		System.out.println(al.isEmpty());
		
		//al.clear();
		
		ArrayList al1=new ArrayList();
		
		al1.add("hundred");
		al1.add(null);
		
		al.removeAll(al1);
		System.out.println(al);
		
		
		
		
		//System.out.println(al.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
