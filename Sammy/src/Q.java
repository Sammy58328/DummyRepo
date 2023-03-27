import java.util.LinkedList;
import java.util.Queue;

public class Q {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<>(); 
		
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
		System.out.println(q);
	}

}
