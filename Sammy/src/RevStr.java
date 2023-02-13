
public class RevStr {
	
	public static void main (String s[])
	{
		
		String sent="My name is Samrat";
		
		String arr[] = sent.split(" ");
		int n=arr.length;
		for (int i=0;i<n; i++)
		{
			StringBuilder sb=new StringBuilder(arr[i]); //Hashtable, StringBuffer, Vector is ThreadSafe.
			System.out.print(sb.reverse()+" "); 		//String is immutable, it don't have reverse method
		}
		
		String a="Ramesh";
		String b="ramesh";
		String c="Ramesh";
		
		System.out.println("Both String equal ? ->" +a.equals(b));
		
		System.out.println("Both String equal ignoring case ? ->" +a.equalsIgnoreCase(b));
		
		System.out.println(a.substring(2));
		System.out.println(a.substring(2,4));
		System.out.println(a.charAt(2));
				
		if (a==c)
			System.out.println("The address are same");
		else
			System.out.println("The address are different");
		
		String d ="    Hello    ";
		System.out.println(d.trim());
		System.out.println(d.strip());
		System.out.println(d.replace('H','W'));
		System.out.println(d.concat("World"));
		
		String e= new String("Ramesh");
		String f= new String("Ramesh");
		System.out.println("Both String equal ? ->" + e==f);
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		System.out.println(e.hashCode());
		System.out.println(f.hashCode());
		
	}
	
	
}
