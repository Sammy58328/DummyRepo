
public class Start {
	
	public static void main (String s[])throws Exception
	
	{
		//Starty sm=new Starty();
		
		
		Class sc = Class.forName("Starty");
		Starty sm= (Starty)sc.newInstance();
		sm.meta();		
	}
}

