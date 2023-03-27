@FunctionalInterface
interface Idasa{	
	void inty();
	}

 interface Inper extends Idasa{	
	 void sada();
}
 
public class Inher implements Inper{
	 
	 public static void main (String s[])
		{		 
		 Inher i = new Inher();
		 i.inty();
		 i. sada();	 
		}

	public void sada() {
		System.out.println ("sada");		
	}

	public void inty() {
		System.out.println ("inty");
	}
	 
 }
