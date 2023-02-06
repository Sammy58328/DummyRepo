import java.util.*;

public class Setu {
	
	public static void main (String s[])
	{
		Set<String> samp = new HashSet<>() // <> is called Generic.
				{
			{
				add("Ramesh"); //Double Brace initialization
				add("Suresh");
				add("Brijesh");
				
			}
				};
				
				System.out.println(samp);
				Iterator<String> ita = samp.iterator();
				System.out.println(ita.next());
		
				Set<String> ramp = new LinkedHashSet<>();
				ramp.add("Pradosh");
				ramp.add("Santosh");
				ramp.add("Paritosh"); //Get, Set, sort don't work for Set
				ramp.add("Avitosh");
				
				System.out.println(ramp);
				
				ramp.remove("Pradosh");
				System.out.println(ramp);

				Iterator<String> it = ramp.iterator();
				while(it.hasNext())
					System.out.println(it.next());
		
	}

}
