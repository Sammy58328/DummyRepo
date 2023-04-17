import java.time.LocalDate;
import java.util.Date;

public class Starty {
	
	public static void main(String[] argv) throws Exception
	{
		System.out.println(System.getenv("TEMP"));
		
		String currentDirectory = System.getProperty("user.dir");
	    System.out.println("The current working directory is " + currentDirectory);
	    
	    System.out.println('a' + 'b' + 2 + 5);  // 97+98+2+5 = 202
	    System.out.println("a" + "b" + 2 + 5);  
	    System.out.println(2 + 5 + "a" + "b");
	    System.out.println(2 + 5 + 'a' + 'b');  //"a" is String and 'a' is character
	    System.out.println('a');
	    System.out.println('a' + 'b');
	    System.out.println('a' + 2);
	    	    
	    
	    Date date = new Date();
	    System.out.println(date.toString());
	    
	    LocalDate ld = LocalDate.of(1970,1,2);
	    System.out.println(ld.toEpochDay());
	}    
}



//Serialization convert the java code to byte code. Transient keyword prevent from Serialization