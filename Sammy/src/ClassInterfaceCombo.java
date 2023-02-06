
class Sree {
	
	void stamen()  //Type of object determined during Compile time is called Static binding. e.g. Public, Static, Final method
	{
		System.out.println("Bello");
	}

}

interface sheetal {	
	void ramen(); //Interface with abstract method is called Functional Interface.
}					//Interface with no data-member or method is called Marker Interface.


public class ClassInterfaceCombo extends Sree implements sheetal{
		
	 public void ramen()
	{
		System.out.println("Hello");
	}
	 
	 public static void main (String s[])
		
		{
		 ClassInterfaceCombo cc = new ClassInterfaceCombo();
		 cc.ramen();
		 cc.stamen();	 
		}
		
}
	
	




