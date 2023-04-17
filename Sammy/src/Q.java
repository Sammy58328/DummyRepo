import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

public class Q {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<>(); 
		
		//Other classes are PriorityQueue, SynchronousQueue etc.
		
		q.add("-E1-");
		q.add("-E2-");
		q.add("-E3-");
		q.add("-E4-");
		q.add("-E5-");
		System.out.println(q.peek());
		
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		
		System.out.println(q.offer("-E6-")); 
		
		//offer() will return false if it fails to insert the element on a size restricted Queue
		//add() will throw IllegalStateException - if the element cannot be added at this time due to capacity restrictions
		System.out.println(q);
		
		
		char i = 'z'+200;
		byte d = (byte)i;
		long j = (long)i;
		short k = (short)i;
		char a = (char)i;
		float b = (float)i;
		double c = (double)i;
		
		System.out.println(j+"\t"+k+"\t"+a+"\t"+b+"\t"+c+"\t"+d);
	}

}
