package july2025;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetCollectiondemo {

	public static void main(String[] args) {


	//	Set ms=new HashSet();
		
		HashSet ms =new HashSet();
		
	//	HashSet<I> ms = new Hashset<>();

		
		ms.add(true);
		ms.add("tushar");
		ms.add(null);
		ms.add('A');
		ms.add(false);
		ms.add(101.01);
		
		System.out.println(ms);
		System.out.println(ms.size());
		
		ms.remove(null);
		
		ArrayList al= new ArrayList(ms);
		
		System.out.println(al);
		
		System.out.println(al.get(4)); 
		
		
		for(Object y : ms)
		{
			System.out.print(y+" ");
			
			
		}
		System.out.println();
		
		
		
		Iterator it =ms.iterator();
		
		while(it.hasNext())
		
		{
			System.out.print(it.next()+" ");
			
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
