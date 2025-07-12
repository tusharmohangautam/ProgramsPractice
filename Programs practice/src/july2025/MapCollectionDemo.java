package july2025;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MapCollectionDemo {

	public static void main(String[] args) {


	//	HashMap hm =new HashMap();
		
	//	Map hm=new Hashmap();
		
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		
		hm.put(101, "Tushar");
		hm.put(102, "java");
		hm.put(103, "python");
		hm.put(102, "english");
		hm.put(104, "maths");
		hm.put(105, "sql");
		
		System.out.println(hm);
		System.out.println(hm.size());
		
		hm.remove(105);
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		
		for(int k:hm.keySet())
		{
			
			System.out.println(k+" "+hm.get(k));
			
		}
		
		
		
		Iterator<Entry<Integer,String>> it=hm.entrySet().iterator();
		
		
		while(it.hasNext())
		{
			Entry<Integer,String> entry= it.next();
			
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
