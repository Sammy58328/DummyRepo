import java.util.Date;

public class Starty {
	
	public static void main(String[] argv) throws Exception
	{
		System.out.println("Hello");
		
		String currentDirectory = System.getProperty("user.dir");
	    System.out.println("The current working directory is " + currentDirectory);
	    
	    Date date = new Date();
	    System.out.println(date.toString());
	}
}



//Serialization convert the java code to byte code. Transient keyword prevent from Serialization