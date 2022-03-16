package collection;

import java.util.HashMap;
import java.util.HashSet;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> obj=new HashMap<Integer,String>();
		obj.put(1, "One");
		obj.put(2, "Two");
		obj.put(2, "Three");
		System.out.println(obj);
		obj.put(3, "Three");
		System.out.println(obj);
		
		System.out.println("-----------Map with String key--------------");
		HashMap<Float,String> newmap=new HashMap<Float,String>();
		
		newmap.put(1.0f, "One");
		newmap.put(2.0f, "Two");	
		System.out.println(newmap);
		
		HashMap<Integer,String> mapobj=new HashMap<Integer,String>();
		mapobj.putAll(obj);
		mapobj.put(4, "One");
		mapobj.put(1, "Five");
		System.out.println(mapobj);
		
		
		System.out.println("mapobj before removal");
		System.out.println(mapobj);
		mapobj.remove("Two");
		System.out.println("mapobj after removal");
		
		HashSet<String> obj1=new HashSet<String>();
		obj1.add("One");
		obj1.add("Two");
		System.out.println(obj1);

	}

}
