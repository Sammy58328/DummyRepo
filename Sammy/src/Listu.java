import java.util.*; //java.util.Map & java.util.Collections are 2 root class of Collection Framework.

public class Listu {
	
	public static void main (String s[])
	{
		List<String> samp = new LinkedList<>() //Double Brace initialization
				{
			{
				add("Ramesh"); //Map, List, Set are interface, can't be instantiated
				add("Suresh");
				add("Brijesh");
				
			}		//ArrayList uses Dynamic Array to store object whereas LinkedList uses DoublyLinkedList.
				};   //ArrayList act as List where as LinkedList acts as List & Queue
				
				System.out.println(samp);
				Iterator<String> ita = samp.iterator();
				System.out.println(ita.next());
				
				System.out.println("Second element - " +samp.get(1));
				samp.set(2,"Dharmesh");
				System.out.println(samp);
				
				Collections.sort(samp);
				System.out.println(samp);
				
				samp.remove(2);
				System.out.println(samp);
				System.out.println(samp.hashCode());
			

	}
}
