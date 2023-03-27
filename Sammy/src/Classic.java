
public class Classic {
	
	static public int z=12; //Static variables are created when the program starts and destroyed when the program stops.
	
	void stamen()
	{
		z=33;
		System.out.println("Bello "+z);
	}
		
	static void ramen()
	{
		z=99;
		System.out.println("Hello "+z);  //Final class can't be inherited, Final method can't be overridden.
	}
	

	
	
	public static void main (String s[])
	
	{
		Classic c=new Classic();
		c.stamen();
		z=45;
		ramen();    //Static methods don't need to initialize
		System.out.println(z);
		
		
	}
	
	static{
		 System.out.println("static block is invoked");
		 }   


}
