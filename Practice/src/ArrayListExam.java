import java.util.*;
public class ArrayListExam {

	public static void main(String[] args) {
		
	ArrayList<String> a=new ArrayList<String>();
	a.add("Sarasa");
	a.add("Susheela");
	a.add("Lalitha");
	//System.out.println(a.get(0));
	/*for(int i=0;i<a.size();i++)
			{
		System.out.println(a.get(i));	
			}*/
	
		a.add(2,"vishalu");
		System.out.println(a);
		a.add(4,"Anantha");
		System.out.println(a);
/*a.remove("Anantha");
System.out.println(a);
a.remove(1);
System.out.println(a);*/
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Prabha");
		a1.add("Shantha");
		a.addAll(a1);
		System.out.println(a);
		
		a.removeAll(a1);
		System.out.println(a);
		a.clear();
		System.out.println(a);
		
		
		
		
		

	}

}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(10);
		num.add(100);
		num.add(452);
		System.out.println(num.get(0));
		
		/*for(int i=0;i<num.size();i++)
		{
			System.out.println(num.get(i));	
		}
		
		for(Integer value:num)
		{
			System.out.println(value);
		}*/

