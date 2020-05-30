import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class Exampleset {
	public static void main(String[] args) {

		
		//Set<String> e1=new LinkedHashSet<String>();
		
		Set<String> e1=new TreeSet<String>();
		
		if(e1.isEmpty())
		{
		System.out.println("list contains empty");	
		}
		
		e1.add("Ahalya");
		e1.add("Kunthi");
		e1.add("Draupadi");
		e1.add("Gandhari");
		e1.add("Dushyala");
		e1.add("Hidanbhi");
		e1.add("Hidanbhi");
		
		
		Set<String> e2=new TreeSet<String>();
		e2.add("Ahalya");
		e2.add("Kunthi");
		e2.add("Raavan");
		e2.add("Kumbhkaran");
		e2.add("Bharath");
		e2.add("Indrajeeth");
		e2.add("Skanda");
		///////////////////intersection///////////////////////////
		/*Set<String> intersection=new HashSet<String>(e1);
		System.out.println(intersection);
		
		intersection.retainAll(e2);
		System.out.println(intersection);
		
		
		////////////////////////difference//////////////////////////////
		
		Set<String> difference=new HashSet<String>(e1);
		
		difference.removeAll(e2);
		System.out.println(difference);*/
		
		
		////////////////////union/////////////////////
		
		
		Set<String> union=new HashSet<String>(e1);
		union.addAll(e2);
		System.out.println(union);
		
		
		
		
		
		/*for(String element: e1) {
			System.out.println(element);
		}
		
		
		if(e1.contains("Babar"))
				{
			System.out.println("contaons babar");
				}
		
		if(e1.contains("Ahalya"))
		{
	System.out.println("contaons Ahalya");*/
		}
		
		
		
		//e1.add(null);
		//e1.add(null);
		//System.out.println(e1);

}
