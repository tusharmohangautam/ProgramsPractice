package july2025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCollectiondemo {

	public static void main(String[] args) {
		
		
	//	List ml = new ArrayList();
		
		ArrayList ml =new ArrayList();
		
	//	ArrayList<String> ml = new ArrayList<String>();
		
		
		ml.add(true);
		ml.add(false);
		ml.add(null);
		ml.add(100);
		ml.add("java");
		ml.add(300);
		ml.add('A');
		ml.add(100.12);
		ml.add("cucumber");
		
		System.out.println(ml);
		System.out.println(ml.size());
		
		ml.remove(5);
		
		System.out.println(ml);
		
		ml.add(5,"Tushar");
		
		System.out.println(ml);
		
		ml.set(5,"Guddu");
		
		System.out.println(ml);
		System.out.println(ml.get(5));
		
		
		for(Object x:ml)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		
		
		Iterator it = ml.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("Look values");
		
		
		System.out.println(ml.isEmpty());
		
		ArrayList ml1=new ArrayList();
		
		ml1.add(true);
		ml1.add("cucumber");
		
		ml.removeAll(ml1);
		
		System.out.print(ml+" ");
		System.out.println();
		
		ml.clear();
		
		System.out.println(ml.isEmpty());
		
		
		
		

	}

}
