
@FunctionalInterface
interface Abc
{
	void cde();
}

public class LambdaEx {
	
	public static void main (String s[]) {
		
		/*
		 * Abc le = new Abc() { 
		 * public void cde() { 
		 * System.out.println("Hi There"); 
		 * } 
		 * };
		 */
		
		Abc le = ()->
		{ 
			 System.out.println("Hi There"); 
		 } ;
		 
	        le.cde();
		
	}

}
