import java.util.HashMap;

public class HashMapExam {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(5,"Five");
		map1.put(6, "Six");
		map1.put(8, "Eight");
		map1.put(7, "Seven");
		String text=map1.get(7);
		System.out.println(text);
		

	}

}
