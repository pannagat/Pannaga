import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueuePractice {

	
	

			public static void main(String[] args) {
				
				Queue<Integer> q1=new ArrayBlockingQueue<Integer>(3);
				q1.add(10);
				q1.add(18);
				q1.add(17);
				
				System.out.println(q1);
				int value=q1.remove();
				System.out.println(value);
				
				

			}

		

	}


