import java.util.LinkedList;

public class LinkedListexam {

	public static void main(String[] args) {
		
		LinkedList<String> example=new LinkedList<String>();
		example.add("Mariswamy");
		example.add("Rajalakshmi");
		example.add("Suma");
		
		example.add("Shobha");
		
		
		example.add(2,"Manjula");
		System.out.println(example);
		
		example.remove(1);
		System.out.println(example);
		
		
		/*LinkedList<String> example2=new LinkedList<String>();
		example2.add("Jayamma");
		example2.add("Rajashekara");
		System.out.println(example2);
		
		example.addAll(example2);
		System.out.println(example);*/
		
		example.removeFirst();
		System.out.println(example);
		example.removeLast();
		System.out.println(example);
		
		
		
		
		
		
		
		/*for(int i=0;i<example.size();i++)
		{
			System.out.println(example.get(i));
		}*/
		
		

	}

}
