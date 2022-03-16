package collection;


import java.util.Iterator;
import java.util.TreeSet;



public class SortedSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer>obj=new TreeSet<Integer>();
		obj.add(2);
		obj.add(1);
		obj.add(1);
		obj.add(3);
		obj.add(15);
		System.out.println(obj);
		System.out.println(obj.first());
		System.out.println(obj.last());
		System.out.println(obj.headSet(3));
		System.out.println(obj.tailSet(3));
		System.out.println(obj.subSet(2, 15)); //It will retrieve the partial set based on starting
		
		Iterator<Integer> iterator= obj.descendingIterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		System.out.println();
		System.out.println(obj.descendingSet());
		
		System.out.println(obj.ceiling(3));
		
		System.out.println(obj.floor(3));
		System.out.println(obj.floor(7));
		System.out.println(obj.floor(-17));
		
		System.out.println(obj.higher(3));
		System.out.println(obj.lower(3));
		
		System.out.println(obj.pollFirst());//It will retrieve and delete first element from collection
		System.out.println(obj);
		System.out.println(obj.pollLast());
		System.out.println(obj);
	

	}

}
