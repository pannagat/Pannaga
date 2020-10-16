import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Iterators {

	public static void main(String[] args) {
		
		
		List<String> list=new ArrayList<String>();
		
		
		list.add("Judwaa");
		list.add("Dabangg");
		list.add("Love");
		list.add("Maine pyar kyun kiya");
		list.add("Jai ho");
		list.add("veer");
		System.out.println(list);
		
		
		ListIterator<String> listiterator=list.listIterator();
		
		while(listiterator.hasNext())
		{
			listiterator.next();
		
			
			listiterator.set("Modified");
			
		}
		System.out.println(list);
		
ListIterator<String> listiterator1=list.listIterator();
		
		while(listiterator1.hasNext())
		{
			listiterator.next();
		
			
			listiterator1.remove();
			
		}
		System.out.println(list);
		
		
	/*we can iterate via the specified index in list iterator
		
	ListIterator listIterator3=list.listIterator(2);
	
	while(listIterator3.hasNext())
	{
		System.out.println(listIterator3.next());
	}
	
	Iterator iterator3=list.iterator(2);
	while(iterator3.hasNext())
	{
		System.out.println(iterator3.next());
	}*/
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Iterators can be traversed only in forward direction
		
		
		Iterator iterator1=list.iterator();
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		
		ListIterator listiterator1=list.listIterator();
		while(listiterator1.hasNext())
		{
			System.out.println(listiterator1.next());
		}
		
		
		ListIterator listiterator2=list.listIterator();
		while(listiterator1.hasPrevious())
		{
			System.out.println(listiterator1.previous());*/
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Iterators can be used to traverse through the list set queue
		
		List<String> list2=new ArrayList<String>(list);
		Iterator iterator1=list.iterator();
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		
		
		Queue queue=new PriorityQueue(list);
		
		Iterator iterator2=list.iterator();
		while(iterator2.hasNext())
		{
			System.out.println(iterator2.next());
		}
		
		
		
		Set set=new HashSet(list);
		
		Iterator iterator3=list.iterator();
		while(iterator3.hasNext())
		{
			System.out.println(iterator3.next());
		}
		
		ListIterator listiterator=list.listIterator();
		
		while(listiterator.hasNext())
		{
			System.out.println(listiterator.next());
		}
		
		
		ListIterator listiterator1=queue.listIterator();
		ListIterator listiterator2=set.listIterator();*/
		

