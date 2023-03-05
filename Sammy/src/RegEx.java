
public class RegEx {
	
	public static void main (String...args)
	{
		String s= "A@n0m@L!";
		
		System.out.println(s.replaceAll("[^A-Za-z0-9]", ""));
		System.out.println(s.replaceAll("[^A-Za-z]", ""));
		System.out.println(s.replaceAll("[^A-Z]", ""));
		System.out.println(s.replaceAll("[^a-z]", ""));
		
		System.out.println(s.replaceAll("[A-Za-z0-9]", ""));
		
		String p= "8,999";
		System.out.println(s.replaceAll("[^0-9]", ""));
	}
	

}
