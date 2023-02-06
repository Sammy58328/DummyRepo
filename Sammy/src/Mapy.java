import java.util.*;

public class Mapy {
	
	public static void main (String s[])
	{
		Map<String,String> samp = new LinkedHashMap<>() //Double Brace initialization
				{
			{
				put(null,"Ram");  //TreeMap will throw NullPointerException if gets Null Key
				put(null,"Shyam");
				put("Roll3","Jadu"); // If multiple null key it will override
				
			}
				};
				
				System.out.println(samp);
				
				samp.put("Roll4","Madhu");
				
				System.out.println(samp);
				System.out.println(samp.entrySet());
				
				Iterator it=	samp.entrySet().iterator();			
				while(it.hasNext())
					System.out.println(it.next());

				
				System.out.println(samp.get("Ram"));
				samp.replace(null, "Viren");
				System.out.println(samp);
				
				System.out.println(samp.keySet());
				System.out.println(samp.values());
				
				samp.remove("Roll3");
				System.out.println(samp);
				
	}
}