import java.util.*;

public class DeQ {
	
	public static void main (String s[])
	{
		Deque<String> dq = new LinkedList<>();
		
		dq.add("-E1-");
		dq.addFirst("-E2-");
		dq.addFirst("-E3-");
		dq.addLast("-E4-");
		dq.addLast("-E5-");
		System.out.println(dq);
		
		System.out.println(dq.peek());
		
		dq.push("-E6-");
		System.out.println(dq);
		
		System.out.println("GetFirst is" +dq.getFirst()); //throws NoSuchElementException
		System.out.println("GetLast is" +dq.getLast());
		
		dq.pop();
		System.out.println(dq);
		
		dq.poll();
		System.out.println(dq);
		
		
		System.out.println(dq.pollFirst());
		System.out.println(dq);
		System.out.println(dq.pollLast());
		
		dq.offer("-E7-");
		System.out.println(dq); //returns boolean
		
		dq.offerFirst("-E8-");
		System.out.println(dq); //returns boolean
		 
		dq.offerLast("-E9-");
		System.out.println(dq);
	}

}
